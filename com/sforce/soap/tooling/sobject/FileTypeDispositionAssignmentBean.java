package com.sforce.soap.tooling.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FileTypeDispositionAssignmentBean extends com.sforce.soap.tooling.sobject.SObject {

    /**
     * Constructor
     */
    public FileTypeDispositionAssignmentBean() {}

    /* Cache the typeInfo instead of declaring static fields throughout*/
    private transient java.util.Map<String, com.sforce.ws.bind.TypeInfo> typeInfoCache = new java.util.HashMap<String, com.sforce.ws.bind.TypeInfo>();
    private com.sforce.ws.bind.TypeInfo _lookupTypeInfo(String fieldName, String namespace, String name, String typeNS, String type, int minOcc, int maxOcc, boolean elementForm) {
      com.sforce.ws.bind.TypeInfo typeInfo = typeInfoCache.get(fieldName);
      if (typeInfo == null) {
        typeInfo = new com.sforce.ws.bind.TypeInfo(namespace, name, typeNS, type, minOcc, maxOcc, elementForm);
        typeInfoCache.put(fieldName, typeInfo);
      }
      return typeInfo;
    }

    /**
     * element : Behavior of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Behavior__is_set = false;

    private java.lang.String Behavior;

    public java.lang.String getBehavior() {
      return Behavior;
    }

    public void setBehavior(java.lang.String Behavior) {
      this.Behavior = Behavior;
      Behavior__is_set = true;
    }

    protected void setBehavior(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Behavior", "urn:sobject.tooling.soap.sforce.com","Behavior","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setBehavior(__typeMapper.readString(__in, _lookupTypeInfo("Behavior", "urn:sobject.tooling.soap.sforce.com","Behavior","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldBehavior(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Behavior", "urn:sobject.tooling.soap.sforce.com","Behavior","http://www.w3.org/2001/XMLSchema","string",0,1,true), Behavior, Behavior__is_set);
    }

    /**
     * element : DurableId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean DurableId__is_set = false;

    private java.lang.String DurableId;

    public java.lang.String getDurableId() {
      return DurableId;
    }

    public void setDurableId(java.lang.String DurableId) {
      this.DurableId = DurableId;
      DurableId__is_set = true;
    }

    protected void setDurableId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DurableId", "urn:sobject.tooling.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDurableId(__typeMapper.readString(__in, _lookupTypeInfo("DurableId", "urn:sobject.tooling.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDurableId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DurableId", "urn:sobject.tooling.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true), DurableId, DurableId__is_set);
    }

    /**
     * element : FileType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean FileType__is_set = false;

    private java.lang.String FileType;

    public java.lang.String getFileType() {
      return FileType;
    }

    public void setFileType(java.lang.String FileType) {
      this.FileType = FileType;
      FileType__is_set = true;
    }

    protected void setFileType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("FileType", "urn:sobject.tooling.soap.sforce.com","FileType","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setFileType(__typeMapper.readString(__in, _lookupTypeInfo("FileType", "urn:sobject.tooling.soap.sforce.com","FileType","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFileType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("FileType", "urn:sobject.tooling.soap.sforce.com","FileType","http://www.w3.org/2001/XMLSchema","string",0,1,true), FileType, FileType__is_set);
    }

    /**
     * element : SecurityRiskFileType of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean SecurityRiskFileType__is_set = false;

    private java.lang.Boolean SecurityRiskFileType;

    public java.lang.Boolean getSecurityRiskFileType() {
      return SecurityRiskFileType;
    }

    public void setSecurityRiskFileType(java.lang.Boolean SecurityRiskFileType) {
      this.SecurityRiskFileType = SecurityRiskFileType;
      SecurityRiskFileType__is_set = true;
    }

    protected void setSecurityRiskFileType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SecurityRiskFileType", "urn:sobject.tooling.soap.sforce.com","SecurityRiskFileType","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setSecurityRiskFileType((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("SecurityRiskFileType", "urn:sobject.tooling.soap.sforce.com","SecurityRiskFileType","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldSecurityRiskFileType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SecurityRiskFileType", "urn:sobject.tooling.soap.sforce.com","SecurityRiskFileType","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), SecurityRiskFileType, SecurityRiskFileType__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.tooling.soap.sforce.com", "FileTypeDispositionAssignmentBean");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       writeFields1(__out, __typeMapper);
    }

    @Override
    public void load(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __typeMapper.consumeStartTag(__in);
      loadFields(__in, __typeMapper);
      __typeMapper.consumeEndTag(__in);
    }

    protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
        super.loadFields(__in, __typeMapper);
        loadFields1(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[FileTypeDispositionAssignmentBean ");
      sb.append(super.toString());
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldBehavior(__out, __typeMapper);
      writeFieldDurableId(__out, __typeMapper);
      writeFieldFileType(__out, __typeMapper);
      writeFieldSecurityRiskFileType(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setBehavior(__in, __typeMapper);
      setDurableId(__in, __typeMapper);
      setFileType(__in, __typeMapper);
      setSecurityRiskFileType(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "Behavior", Behavior);
      toStringHelper(sb, "DurableId", DurableId);
      toStringHelper(sb, "FileType", FileType);
      toStringHelper(sb, "SecurityRiskFileType", SecurityRiskFileType);
    }


}