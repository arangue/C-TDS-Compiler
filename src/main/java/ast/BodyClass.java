/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.ast;

import java.util.List;

/**
 *
 * @author Adrian Tissera
 */
public class BodyClass {
	private final List<FieldDecl> fl;
	private final List<MethodDecl> ml;
	
	public BodyClass(List<FieldDecl> fl, List<MethodDecl> ml) {
		this.fl = fl;
		this.ml = ml;
	}
}