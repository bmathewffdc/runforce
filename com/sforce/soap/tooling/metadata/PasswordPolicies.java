package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class PasswordPolicies implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public PasswordPolicies() {}

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
     * element : apiOnlyUserHomePageURL of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean apiOnlyUserHomePageURL__is_set = false;

    private java.lang.String apiOnlyUserHomePageURL;

    public java.lang.String getApiOnlyUserHomePageURL() {
      return apiOnlyUserHomePageURL;
    }

    public void setApiOnlyUserHomePageURL(java.lang.String apiOnlyUserHomePageURL) {
      this.apiOnlyUserHomePageURL = apiOnlyUserHomePageURL;
      apiOnlyUserHomePageURL__is_set = true;
    }

    protected void setApiOnlyUserHomePageURL(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("apiOnlyUserHomePageURL", "urn:metadata.tooling.soap.sforce.com","apiOnlyUserHomePageURL","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setApiOnlyUserHomePageURL(__typeMapper.readString(__in, _lookupTypeInfo("apiOnlyUserHomePageURL", "urn:metadata.tooling.soap.sforce.com","apiOnlyUserHomePageURL","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldApiOnlyUserHomePageURL(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("apiOnlyUserHomePageURL", "urn:metadata.tooling.soap.sforce.com","apiOnlyUserHomePageURL","http://www.w3.org/2001/XMLSchema","string",0,1,true), apiOnlyUserHomePageURL, apiOnlyUserHomePageURL__is_set);
    }

    /**
     * element : complexity of type {urn:metadata.tooling.soap.sforce.com}Complexity
     * java type: com.sforce.soap.tooling.metadata.Complexity
     */
    private boolean complexity__is_set = false;

    private com.sforce.soap.tooling.metadata.Complexity complexity;

    public com.sforce.soap.tooling.metadata.Complexity getComplexity() {
      return complexity;
    }

    public void setComplexity(com.sforce.soap.tooling.metadata.Complexity complexity) {
      this.complexity = complexity;
      complexity__is_set = true;
    }

    protected void setComplexity(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("complexity", "urn:metadata.tooling.soap.sforce.com","complexity","urn:metadata.tooling.soap.sforce.com","Complexity",0,1,true))) {
        setComplexity((com.sforce.soap.tooling.metadata.Complexity)__typeMapper.readObject(__in, _lookupTypeInfo("complexity", "urn:metadata.tooling.soap.sforce.com","complexity","urn:metadata.tooling.soap.sforce.com","Complexity",0,1,true), com.sforce.soap.tooling.metadata.Complexity.class));
      }
    }

    private void writeFieldComplexity(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("complexity", "urn:metadata.tooling.soap.sforce.com","complexity","urn:metadata.tooling.soap.sforce.com","Complexity",0,1,true), complexity, complexity__is_set);
    }

    /**
     * element : expiration of type {urn:metadata.tooling.soap.sforce.com}Expiration
     * java type: com.sforce.soap.tooling.metadata.Expiration
     */
    private boolean expiration__is_set = false;

    private com.sforce.soap.tooling.metadata.Expiration expiration;

    public com.sforce.soap.tooling.metadata.Expiration getExpiration() {
      return expiration;
    }

    public void setExpiration(com.sforce.soap.tooling.metadata.Expiration expiration) {
      this.expiration = expiration;
      expiration__is_set = true;
    }

    protected void setExpiration(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("expiration", "urn:metadata.tooling.soap.sforce.com","expiration","urn:metadata.tooling.soap.sforce.com","Expiration",0,1,true))) {
        setExpiration((com.sforce.soap.tooling.metadata.Expiration)__typeMapper.readObject(__in, _lookupTypeInfo("expiration", "urn:metadata.tooling.soap.sforce.com","expiration","urn:metadata.tooling.soap.sforce.com","Expiration",0,1,true), com.sforce.soap.tooling.metadata.Expiration.class));
      }
    }

    private void writeFieldExpiration(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("expiration", "urn:metadata.tooling.soap.sforce.com","expiration","urn:metadata.tooling.soap.sforce.com","Expiration",0,1,true), expiration, expiration__is_set);
    }

    /**
     * element : historyRestriction of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean historyRestriction__is_set = false;

    private java.lang.String historyRestriction;

    public java.lang.String getHistoryRestriction() {
      return historyRestriction;
    }

    public void setHistoryRestriction(java.lang.String historyRestriction) {
      this.historyRestriction = historyRestriction;
      historyRestriction__is_set = true;
    }

    protected void setHistoryRestriction(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("historyRestriction", "urn:metadata.tooling.soap.sforce.com","historyRestriction","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setHistoryRestriction(__typeMapper.readString(__in, _lookupTypeInfo("historyRestriction", "urn:metadata.tooling.soap.sforce.com","historyRestriction","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldHistoryRestriction(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("historyRestriction", "urn:metadata.tooling.soap.sforce.com","historyRestriction","http://www.w3.org/2001/XMLSchema","string",0,1,true), historyRestriction, historyRestriction__is_set);
    }

    /**
     * element : lockoutInterval of type {urn:metadata.tooling.soap.sforce.com}LockoutInterval
     * java type: com.sforce.soap.tooling.metadata.LockoutInterval
     */
    private boolean lockoutInterval__is_set = false;

    private com.sforce.soap.tooling.metadata.LockoutInterval lockoutInterval;

    public com.sforce.soap.tooling.metadata.LockoutInterval getLockoutInterval() {
      return lockoutInterval;
    }

    public void setLockoutInterval(com.sforce.soap.tooling.metadata.LockoutInterval lockoutInterval) {
      this.lockoutInterval = lockoutInterval;
      lockoutInterval__is_set = true;
    }

    protected void setLockoutInterval(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("lockoutInterval", "urn:metadata.tooling.soap.sforce.com","lockoutInterval","urn:metadata.tooling.soap.sforce.com","LockoutInterval",0,1,true))) {
        setLockoutInterval((com.sforce.soap.tooling.metadata.LockoutInterval)__typeMapper.readObject(__in, _lookupTypeInfo("lockoutInterval", "urn:metadata.tooling.soap.sforce.com","lockoutInterval","urn:metadata.tooling.soap.sforce.com","LockoutInterval",0,1,true), com.sforce.soap.tooling.metadata.LockoutInterval.class));
      }
    }

    private void writeFieldLockoutInterval(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("lockoutInterval", "urn:metadata.tooling.soap.sforce.com","lockoutInterval","urn:metadata.tooling.soap.sforce.com","LockoutInterval",0,1,true), lockoutInterval, lockoutInterval__is_set);
    }

    /**
     * element : maxLoginAttempts of type {urn:metadata.tooling.soap.sforce.com}MaxLoginAttempts
     * java type: com.sforce.soap.tooling.metadata.MaxLoginAttempts
     */
    private boolean maxLoginAttempts__is_set = false;

    private com.sforce.soap.tooling.metadata.MaxLoginAttempts maxLoginAttempts;

    public com.sforce.soap.tooling.metadata.MaxLoginAttempts getMaxLoginAttempts() {
      return maxLoginAttempts;
    }

    public void setMaxLoginAttempts(com.sforce.soap.tooling.metadata.MaxLoginAttempts maxLoginAttempts) {
      this.maxLoginAttempts = maxLoginAttempts;
      maxLoginAttempts__is_set = true;
    }

    protected void setMaxLoginAttempts(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("maxLoginAttempts", "urn:metadata.tooling.soap.sforce.com","maxLoginAttempts","urn:metadata.tooling.soap.sforce.com","MaxLoginAttempts",0,1,true))) {
        setMaxLoginAttempts((com.sforce.soap.tooling.metadata.MaxLoginAttempts)__typeMapper.readObject(__in, _lookupTypeInfo("maxLoginAttempts", "urn:metadata.tooling.soap.sforce.com","maxLoginAttempts","urn:metadata.tooling.soap.sforce.com","MaxLoginAttempts",0,1,true), com.sforce.soap.tooling.metadata.MaxLoginAttempts.class));
      }
    }

    private void writeFieldMaxLoginAttempts(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("maxLoginAttempts", "urn:metadata.tooling.soap.sforce.com","maxLoginAttempts","urn:metadata.tooling.soap.sforce.com","MaxLoginAttempts",0,1,true), maxLoginAttempts, maxLoginAttempts__is_set);
    }

    /**
     * element : minimumPasswordLength of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean minimumPasswordLength__is_set = false;

    private java.lang.String minimumPasswordLength;

    public java.lang.String getMinimumPasswordLength() {
      return minimumPasswordLength;
    }

    public void setMinimumPasswordLength(java.lang.String minimumPasswordLength) {
      this.minimumPasswordLength = minimumPasswordLength;
      minimumPasswordLength__is_set = true;
    }

    protected void setMinimumPasswordLength(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("minimumPasswordLength", "urn:metadata.tooling.soap.sforce.com","minimumPasswordLength","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setMinimumPasswordLength(__typeMapper.readString(__in, _lookupTypeInfo("minimumPasswordLength", "urn:metadata.tooling.soap.sforce.com","minimumPasswordLength","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMinimumPasswordLength(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("minimumPasswordLength", "urn:metadata.tooling.soap.sforce.com","minimumPasswordLength","http://www.w3.org/2001/XMLSchema","string",0,1,true), minimumPasswordLength, minimumPasswordLength__is_set);
    }

    /**
     * element : minimumPasswordLifetime of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean minimumPasswordLifetime__is_set = false;

    private boolean minimumPasswordLifetime;

    public boolean getMinimumPasswordLifetime() {
      return minimumPasswordLifetime;
    }

    public boolean isMinimumPasswordLifetime() {
      return minimumPasswordLifetime;
    }

    public void setMinimumPasswordLifetime(boolean minimumPasswordLifetime) {
      this.minimumPasswordLifetime = minimumPasswordLifetime;
      minimumPasswordLifetime__is_set = true;
    }

    protected void setMinimumPasswordLifetime(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("minimumPasswordLifetime", "urn:metadata.tooling.soap.sforce.com","minimumPasswordLifetime","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setMinimumPasswordLifetime(__typeMapper.readBoolean(__in, _lookupTypeInfo("minimumPasswordLifetime", "urn:metadata.tooling.soap.sforce.com","minimumPasswordLifetime","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldMinimumPasswordLifetime(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("minimumPasswordLifetime", "urn:metadata.tooling.soap.sforce.com","minimumPasswordLifetime","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), minimumPasswordLifetime, minimumPasswordLifetime__is_set);
    }

    /**
     * element : obscureSecretAnswer of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean obscureSecretAnswer__is_set = false;

    private boolean obscureSecretAnswer;

    public boolean getObscureSecretAnswer() {
      return obscureSecretAnswer;
    }

    public boolean isObscureSecretAnswer() {
      return obscureSecretAnswer;
    }

    public void setObscureSecretAnswer(boolean obscureSecretAnswer) {
      this.obscureSecretAnswer = obscureSecretAnswer;
      obscureSecretAnswer__is_set = true;
    }

    protected void setObscureSecretAnswer(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("obscureSecretAnswer", "urn:metadata.tooling.soap.sforce.com","obscureSecretAnswer","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setObscureSecretAnswer(__typeMapper.readBoolean(__in, _lookupTypeInfo("obscureSecretAnswer", "urn:metadata.tooling.soap.sforce.com","obscureSecretAnswer","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldObscureSecretAnswer(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("obscureSecretAnswer", "urn:metadata.tooling.soap.sforce.com","obscureSecretAnswer","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), obscureSecretAnswer, obscureSecretAnswer__is_set);
    }

    /**
     * element : passwordAssistanceMessage of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean passwordAssistanceMessage__is_set = false;

    private java.lang.String passwordAssistanceMessage;

    public java.lang.String getPasswordAssistanceMessage() {
      return passwordAssistanceMessage;
    }

    public void setPasswordAssistanceMessage(java.lang.String passwordAssistanceMessage) {
      this.passwordAssistanceMessage = passwordAssistanceMessage;
      passwordAssistanceMessage__is_set = true;
    }

    protected void setPasswordAssistanceMessage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("passwordAssistanceMessage", "urn:metadata.tooling.soap.sforce.com","passwordAssistanceMessage","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setPasswordAssistanceMessage(__typeMapper.readString(__in, _lookupTypeInfo("passwordAssistanceMessage", "urn:metadata.tooling.soap.sforce.com","passwordAssistanceMessage","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldPasswordAssistanceMessage(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("passwordAssistanceMessage", "urn:metadata.tooling.soap.sforce.com","passwordAssistanceMessage","http://www.w3.org/2001/XMLSchema","string",0,1,true), passwordAssistanceMessage, passwordAssistanceMessage__is_set);
    }

    /**
     * element : passwordAssistanceURL of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean passwordAssistanceURL__is_set = false;

    private java.lang.String passwordAssistanceURL;

    public java.lang.String getPasswordAssistanceURL() {
      return passwordAssistanceURL;
    }

    public void setPasswordAssistanceURL(java.lang.String passwordAssistanceURL) {
      this.passwordAssistanceURL = passwordAssistanceURL;
      passwordAssistanceURL__is_set = true;
    }

    protected void setPasswordAssistanceURL(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("passwordAssistanceURL", "urn:metadata.tooling.soap.sforce.com","passwordAssistanceURL","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setPasswordAssistanceURL(__typeMapper.readString(__in, _lookupTypeInfo("passwordAssistanceURL", "urn:metadata.tooling.soap.sforce.com","passwordAssistanceURL","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldPasswordAssistanceURL(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("passwordAssistanceURL", "urn:metadata.tooling.soap.sforce.com","passwordAssistanceURL","http://www.w3.org/2001/XMLSchema","string",0,1,true), passwordAssistanceURL, passwordAssistanceURL__is_set);
    }

    /**
     * element : questionRestriction of type {urn:metadata.tooling.soap.sforce.com}QuestionRestriction
     * java type: com.sforce.soap.tooling.metadata.QuestionRestriction
     */
    private boolean questionRestriction__is_set = false;

    private com.sforce.soap.tooling.metadata.QuestionRestriction questionRestriction;

    public com.sforce.soap.tooling.metadata.QuestionRestriction getQuestionRestriction() {
      return questionRestriction;
    }

    public void setQuestionRestriction(com.sforce.soap.tooling.metadata.QuestionRestriction questionRestriction) {
      this.questionRestriction = questionRestriction;
      questionRestriction__is_set = true;
    }

    protected void setQuestionRestriction(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("questionRestriction", "urn:metadata.tooling.soap.sforce.com","questionRestriction","urn:metadata.tooling.soap.sforce.com","QuestionRestriction",0,1,true))) {
        setQuestionRestriction((com.sforce.soap.tooling.metadata.QuestionRestriction)__typeMapper.readObject(__in, _lookupTypeInfo("questionRestriction", "urn:metadata.tooling.soap.sforce.com","questionRestriction","urn:metadata.tooling.soap.sforce.com","QuestionRestriction",0,1,true), com.sforce.soap.tooling.metadata.QuestionRestriction.class));
      }
    }

    private void writeFieldQuestionRestriction(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("questionRestriction", "urn:metadata.tooling.soap.sforce.com","questionRestriction","urn:metadata.tooling.soap.sforce.com","QuestionRestriction",0,1,true), questionRestriction, questionRestriction__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
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
        loadFields1(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[PasswordPolicies ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldApiOnlyUserHomePageURL(__out, __typeMapper);
      writeFieldComplexity(__out, __typeMapper);
      writeFieldExpiration(__out, __typeMapper);
      writeFieldHistoryRestriction(__out, __typeMapper);
      writeFieldLockoutInterval(__out, __typeMapper);
      writeFieldMaxLoginAttempts(__out, __typeMapper);
      writeFieldMinimumPasswordLength(__out, __typeMapper);
      writeFieldMinimumPasswordLifetime(__out, __typeMapper);
      writeFieldObscureSecretAnswer(__out, __typeMapper);
      writeFieldPasswordAssistanceMessage(__out, __typeMapper);
      writeFieldPasswordAssistanceURL(__out, __typeMapper);
      writeFieldQuestionRestriction(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setApiOnlyUserHomePageURL(__in, __typeMapper);
      setComplexity(__in, __typeMapper);
      setExpiration(__in, __typeMapper);
      setHistoryRestriction(__in, __typeMapper);
      setLockoutInterval(__in, __typeMapper);
      setMaxLoginAttempts(__in, __typeMapper);
      setMinimumPasswordLength(__in, __typeMapper);
      setMinimumPasswordLifetime(__in, __typeMapper);
      setObscureSecretAnswer(__in, __typeMapper);
      setPasswordAssistanceMessage(__in, __typeMapper);
      setPasswordAssistanceURL(__in, __typeMapper);
      setQuestionRestriction(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "apiOnlyUserHomePageURL", apiOnlyUserHomePageURL);
      toStringHelper(sb, "complexity", complexity);
      toStringHelper(sb, "expiration", expiration);
      toStringHelper(sb, "historyRestriction", historyRestriction);
      toStringHelper(sb, "lockoutInterval", lockoutInterval);
      toStringHelper(sb, "maxLoginAttempts", maxLoginAttempts);
      toStringHelper(sb, "minimumPasswordLength", minimumPasswordLength);
      toStringHelper(sb, "minimumPasswordLifetime", minimumPasswordLifetime);
      toStringHelper(sb, "obscureSecretAnswer", obscureSecretAnswer);
      toStringHelper(sb, "passwordAssistanceMessage", passwordAssistanceMessage);
      toStringHelper(sb, "passwordAssistanceURL", passwordAssistanceURL);
      toStringHelper(sb, "questionRestriction", questionRestriction);
    }


}