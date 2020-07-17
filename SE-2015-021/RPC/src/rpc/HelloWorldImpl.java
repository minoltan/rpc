/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpc;

/**
 *
 * @author Minoltan
 */

import javax.jws.WebService;

@WebService(endpointInterface = "rpc_helloworld.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
    @Override
    public String getHelloWorld(String name) {
        return name;
    }
}
