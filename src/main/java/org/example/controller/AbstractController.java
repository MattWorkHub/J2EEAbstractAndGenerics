package org.example.controller;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

public abstract class AbstractController<T,ID> {

    public Response findById(@PathParam("id") ID id) {
        T entity = findEntityById(id);
        return Response.ok(entity).build();
    }
}
