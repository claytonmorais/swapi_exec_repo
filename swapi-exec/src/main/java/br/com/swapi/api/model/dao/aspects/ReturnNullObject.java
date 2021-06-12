package br.com.swapi.api.model.dao.aspects;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Anota��o para tratar o retorno do dao
 * 
 * OBS: esta anota��o deve ser utilizada somente em classes DAO
 * 
 * @author Clayton Morais de Oliveira
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ReturnNullObject {}