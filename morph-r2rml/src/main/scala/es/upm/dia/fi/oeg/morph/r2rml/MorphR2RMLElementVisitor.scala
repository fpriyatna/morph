package es.upm.dia.fi.oeg.morph.r2rml

import es.upm.dia.fi.oeg.morph.r2rml.model.R2RMLLogicalTable
import es.upm.dia.fi.oeg.morph.r2rml.model.R2RMLObjectMap
import es.upm.dia.fi.oeg.morph.r2rml.model.R2RMLRefObjectMap
import es.upm.dia.fi.oeg.morph.r2rml.model.R2RMLTermMap
import es.upm.dia.fi.oeg.morph.r2rml.model.R2RMLTriplesMap
import es.upm.dia.fi.oeg.morph.r2rml.model.R2RMLMappingDocument


trait MorphR2RMLElementVisitor {
	def visit(md:R2RMLMappingDocument ) : Object;
	def visit(tm:R2RMLTriplesMap ) : Object;
	def visit(lt:R2RMLLogicalTable ) : Object ;
	def visit(om:R2RMLObjectMap ) : Object ;
	def visit(rom:R2RMLRefObjectMap):Object ;
	def visit(tm:R2RMLTermMap) : Object ;
}