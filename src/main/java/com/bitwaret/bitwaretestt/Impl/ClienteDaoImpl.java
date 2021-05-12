package com.bitwaret.bitwaretestt.Impl;

import org.bson.BsonDocument;
import org.bson.Document;
import org.springframework.stereotype.Component;

import com.bitwaret.bitwaretestt.dao.ClienteDao;
import com.bitwaret.bitwaretestt.entity.ClienteEntity;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;

@Component
public class ClienteDaoImpl implements ClienteDao {
	
	//MongoCte mongoCte = new MongoCte();

	@Override
	public ClienteEntity getCliente(ClienteEntity cte) {
		// TODO Auto-generated method stub
		MongoClient mongoClient = MongoClients.create("mongodb://127.0.0.1:27017");
		MongoCollection<Document> collection = mongoClient.getDatabase("bitware").getCollection("cliente");
		Document doc = new Document();
		doc = collection.find(Filters.eq("correo_electronico", cte.getCorreo_electronico())).first();
		if(doc != null) {
			ClienteEntity cliente = new ClienteEntity();
			cliente.setNombre(doc.getString("nombre"));
			cliente.setId_cte(doc.getLong("id_cte"));
			cliente.setNombre_usuario(doc.getString("nombre_usuario"));
			cliente.setContrasenia(doc.getString("contrasenia"));
			cliente.setApellidos(doc.getString("apellidos"));
			cliente.setCorreo_electronico(doc.getString("correo_electronico"));
			cliente.setEdad(doc.getInteger("edad"));
			cliente.setEstatura(doc.getDouble("estatura"));
			cliente.setPeso(doc.getDouble("peso"));
			cliente.setIMC(doc.getDouble("imc"));
			cliente.setGEB(doc.getDouble("geb"));
			cliente.setETA(doc.getDouble("eta"));
			cliente.setFecha_creacion(doc.getDate("fecha_creacion"));
			cliente.setFecha_actualizacion(doc.getDate("fecha_actualizacion"));
			return cliente;
		}
		return null;
	}

	@Override
	public void addCliente(ClienteEntity cte) {
		// TODO Auto-generated method stub
		MongoClient mongoClient = MongoClients.create("mongodb://127.0.0.1:27017");
	    System.out.println("Connected to the database successfully"); 
		Document doc = new Document();
		doc.put("nombre", cte.getNombre());
		doc.put("id_cte", cte.getId_cte());
		doc.put("nombre_usuario", cte.getNombre_usuario());
		doc.put("contrasenia", cte.getContrasenia());
		doc.put("apellidos", cte.getApellidos());
		doc.put("correo_electronico", cte.getCorreo_electronico());
		doc.put("edad", cte.getEdad());
		doc.put("estatura", cte.getEstatura());
		doc.put("peso", cte.getPeso());
		doc.put("imc", cte.getIMC());
		doc.put("geb", cte.getGEB());
		doc.put("eta", cte.getETA());
		doc.put("fecha_creacion", cte.getFecha_creacion());
		doc.put("fecha_actualizacion", cte.getFecha_actualizacion());
		MongoCollection<Document> collection = mongoClient.getDatabase("bitware").getCollection("cliente");
		collection.insertOne(doc);
	}

	@Override
	public void updateCliente(ClienteEntity cte) {
		// TODO Auto-generated method stub
		MongoClient mongoClient = MongoClients.create("mongodb://127.0.0.1:27017");
		BasicDBObject updateFields = new BasicDBObject();
        updateFields.append("correo_electronico", cte.getCorreo_electronico());
        updateFields.append("nombre", cte.getNombre());
        updateFields.append("nombre_usuario", cte.getNombre_usuario());
        updateFields.append("contrasenia", cte.getContrasenia());
        updateFields.append("apellidos", cte.getApellidos());
        updateFields.append("correo_electronico", cte.getCorreo_electronico());
        updateFields.append("edad", cte.getEdad());
        updateFields.append("estatura", cte.getEstatura());
        updateFields.append("peso", cte.getPeso());
        updateFields.append("imc", cte.getIMC());
        updateFields.append("geb", cte.getGEB());
        updateFields.append("eta", cte.getETA());
        updateFields.append("fecha_creacion", cte.getFecha_creacion());
        updateFields.append("fecha_actualizacion", cte.getFecha_actualizacion());
        BasicDBObject setQuery = new BasicDBObject();
        setQuery.append("$set", updateFields);
        BasicDBObject query = new BasicDBObject();
        query.put("correo_electronico", cte.getCorreo_electronico());
		MongoCollection<Document> collection = mongoClient.getDatabase("bitware").getCollection("cliente");
		collection.updateOne(query, setQuery);
	}

}
