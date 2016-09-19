/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.ast;

import java.util.List;
import main.java.visitor.ASTVisitor;

/**
 *
 * @author Adrian Tissera
 */
public class FieldDecl extends Declaration{
	private final Type t;
	private final List<IdFieldDecl> lifd;
	
	
	public FieldDecl(Type t, List<IdFieldDecl> lifd){
		this.t = t;
		this.lifd = lifd;
	}
	
	@Override
	public String toString(){
		String result = new String();
		if (lifd != null) {
			int n = lifd.size();
			result += t.toString() + " ";
			for (IdFieldDecl ifd : lifd) {
				result += ifd.toString();
				if (n > 1) {
					result += ", ";
				}
				n--;
			}
		}
		result += ";";
		return result;
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
	
}
