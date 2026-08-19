package android.gov.nist.core;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes.dex */
public abstract class GenericObject implements Serializable, Cloneable {
    protected static final String AND = "&";

    /* JADX INFO: renamed from: AT */
    protected static final String f31978AT = "@";
    protected static final String COLON = ":";
    protected static final String COMMA = ",";
    protected static final String DOT = ".";
    protected static final String DOUBLE_QUOTE = "\"";
    protected static final String EQUALS = "=";
    protected static final String GREATER_THAN = ">";

    /* JADX INFO: renamed from: HT */
    protected static final String f31979HT = "\t";
    protected static final String LESS_THAN = "<";
    protected static final String LPAREN = "(";
    protected static final String NEWLINE = "\r\n";
    protected static final String PERCENT = "%";
    protected static final String POUND = "#";
    protected static final String QUESTION = "?";
    protected static final String QUOTE = "'";
    protected static final String RETURN = "\n";
    protected static final String RPAREN = ")";
    protected static final String SEMICOLON = ";";
    protected static final String SLASH = "/";

    /* JADX INFO: renamed from: SP */
    protected static final String f31980SP = " ";
    protected static final String STAR = "*";
    protected Match matchExpression;
    protected static final Set<Class<?>> immutableClasses = new HashSet(10);
    static final String[] immutableClassNames = {"String", "Character", "Boolean", "Byte", "Short", "Integer", "Long", "Float", "Double"};
    protected int indentation = 0;
    protected String stringRepresentation = "";

    static {
        int i10 = 0;
        while (true) {
            try {
                String[] strArr = immutableClassNames;
                if (i10 >= strArr.length) {
                    return;
                }
                immutableClasses.add(Class.forName("java.lang." + strArr[i10]));
                i10++;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("Internal error", e10);
            }
        }
    }

    public static Class<?> getClassFromName(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e10) {
            InternalErrorHandler.handleException(e10);
            return null;
        }
    }

    public static boolean isMySubclass(Class<?> cls) {
        return GenericObject.class.isAssignableFrom(cls);
    }

    public static Object makeClone(Object obj) throws CloneNotSupportedException {
        Object objClone;
        if (obj == null) {
            throw new NullPointerException("null obj!");
        }
        Class<?> cls = obj.getClass();
        if (immutableClasses.contains(cls)) {
            return obj;
        }
        if (!cls.isArray()) {
            if (GenericObject.class.isAssignableFrom(cls)) {
                return ((GenericObject) obj).clone();
            }
            if (GenericObjectList.class.isAssignableFrom(cls)) {
                return ((GenericObjectList) obj).clone();
            }
            if (!Cloneable.class.isAssignableFrom(cls)) {
                return obj;
            }
            try {
                return cls.getMethod("clone", null).invoke(obj, null);
            } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
                return obj;
            } catch (IllegalArgumentException e10) {
                InternalErrorHandler.handleException(e10);
                return obj;
            }
        }
        Class<?> componentType = cls.getComponentType();
        if (!componentType.isPrimitive()) {
            return ((Object[]) obj).clone();
        }
        if (componentType == Character.TYPE) {
            objClone = ((char[]) obj).clone();
        } else {
            objClone = componentType == Boolean.TYPE ? ((boolean[]) obj).clone() : obj;
        }
        if (componentType == Byte.TYPE) {
            return ((byte[]) obj).clone();
        }
        if (componentType == Short.TYPE) {
            return ((short[]) obj).clone();
        }
        if (componentType == Integer.TYPE) {
            return ((int[]) obj).clone();
        }
        if (componentType == Long.TYPE) {
            return ((long[]) obj).clone();
        }
        if (componentType == Float.TYPE) {
            return ((float[]) obj).clone();
        }
        return componentType == Double.TYPE ? ((double[]) obj).clone() : objClone;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException("Internal error");
        }
    }

    public void dbgPrint() {
        Debug.println(debugDump());
    }

    public String debugDump() {
        this.stringRepresentation = "";
        Class<?> cls = getClass();
        sprint(cls.getName());
        sprint("{");
        for (Field field : cls.getDeclaredFields()) {
            if ((field.getModifiers() & 2) != 2) {
                Class<?> type = field.getType();
                String name = field.getName();
                if (name.compareTo("stringRepresentation") != 0 && name.compareTo("indentation") != 0) {
                    sprint(name.concat(":"));
                    try {
                        if (type.isPrimitive()) {
                            String string = type.toString();
                            sprint(string + ":");
                            if (string.compareTo("int") == 0) {
                                sprint(field.getInt(this));
                            } else if (string.compareTo("short") == 0) {
                                sprint(field.getShort(this));
                            } else if (string.compareTo("char") == 0) {
                                sprint(field.getChar(this));
                            } else if (string.compareTo("long") == 0) {
                                sprint(field.getLong(this));
                            } else if (string.compareTo("boolean") == 0) {
                                sprint(field.getBoolean(this));
                            } else if (string.compareTo("double") == 0) {
                                sprint(field.getDouble(this));
                            } else if (string.compareTo("float") == 0) {
                                sprint(field.getFloat(this));
                            }
                        } else if (GenericObject.class.isAssignableFrom(type)) {
                            if (field.get(this) != null) {
                                sprint(((GenericObject) field.get(this)).debugDump(this.indentation + 1));
                            } else {
                                sprint("<null>");
                            }
                        } else if (!GenericObjectList.class.isAssignableFrom(type)) {
                            if (field.get(this) != null) {
                                sprint(field.get(this).getClass().getName() + ":");
                            } else {
                                sprint(type.getName() + ":");
                            }
                            sprint("{");
                            if (field.get(this) != null) {
                                sprint(field.get(this).toString());
                            } else {
                                sprint("<null>");
                            }
                            sprint("}");
                        } else if (field.get(this) != null) {
                            sprint(((GenericObjectList) field.get(this)).debugDump(this.indentation + 1));
                        } else {
                            sprint("<null>");
                        }
                    } catch (IllegalAccessException unused) {
                    } catch (Exception e10) {
                        InternalErrorHandler.handleException(e10);
                    }
                }
            }
        }
        sprint("}");
        return this.stringRepresentation;
    }

    public abstract String encode();

    public StringBuilder encode(StringBuilder sb2) {
        sb2.append(encode());
        return sb2;
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        Class<?> superclass = getClass();
        Class<?> superclass2 = obj.getClass();
        while (true) {
            Field[] declaredFields = superclass.getDeclaredFields();
            Field[] declaredFields2 = superclass2.getDeclaredFields();
            for (int i10 = 0; i10 < declaredFields.length; i10++) {
                Field field = declaredFields[i10];
                Field field2 = declaredFields2[i10];
                if ((field.getModifiers() & 2) != 2) {
                    Class<?> type = field.getType();
                    String name = field.getName();
                    if (name.compareTo("stringRepresentation") != 0 && name.compareTo("indentation") != 0) {
                        try {
                            if (type.isPrimitive()) {
                                String string = type.toString();
                                if (string.compareTo("int") == 0) {
                                    if (field.getInt(this) != field2.getInt(obj)) {
                                        return false;
                                    }
                                } else if (string.compareTo("short") == 0) {
                                    if (field.getShort(this) != field2.getShort(obj)) {
                                        return false;
                                    }
                                } else if (string.compareTo("char") == 0) {
                                    if (field.getChar(this) != field2.getChar(obj)) {
                                        return false;
                                    }
                                } else if (string.compareTo("long") == 0) {
                                    if (field.getLong(this) != field2.getLong(obj)) {
                                        return false;
                                    }
                                } else if (string.compareTo("boolean") == 0) {
                                    if (field.getBoolean(this) != field2.getBoolean(obj)) {
                                        return false;
                                    }
                                } else if (string.compareTo("double") == 0) {
                                    if (field.getDouble(this) != field2.getDouble(obj)) {
                                        return false;
                                    }
                                } else if (string.compareTo("float") == 0 && field.getFloat(this) != field2.getFloat(obj)) {
                                    return false;
                                }
                            } else {
                                if (field2.get(obj) == field.get(this)) {
                                    return true;
                                }
                                if (field.get(this) == null || field2.get(obj) == null) {
                                    return false;
                                }
                                if ((field2.get(obj) == null && field.get(this) != null) || !field.get(this).equals(field2.get(obj))) {
                                    return false;
                                }
                            }
                        } catch (IllegalAccessException e10) {
                            InternalErrorHandler.handleException(e10);
                        }
                    }
                }
            }
            if (superclass.equals(GenericObject.class)) {
                return true;
            }
            superclass = superclass.getSuperclass();
            superclass2 = superclass2.getSuperclass();
        }
    }

    public String getIndentation() {
        char[] cArr = new char[this.indentation];
        Arrays.fill(cArr, ' ');
        return new String(cArr);
    }

    public Match getMatcher() {
        return this.matchExpression;
    }

    public boolean match(Object obj) {
        if (obj == null) {
            return true;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        GenericObject genericObject = (GenericObject) obj;
        Field[] declaredFields = getClass().getDeclaredFields();
        Field[] declaredFields2 = obj.getClass().getDeclaredFields();
        for (int i10 = 0; i10 < declaredFields.length; i10++) {
            Field field = declaredFields[i10];
            Field field2 = declaredFields2[i10];
            if ((field.getModifiers() & 2) != 2) {
                Class<?> type = field.getType();
                String name = field.getName();
                if (name.compareTo("stringRepresentation") != 0 && name.compareTo("indentation") != 0) {
                    try {
                        if (type.isPrimitive()) {
                            String string = type.toString();
                            if (string.compareTo("int") == 0) {
                                if (field.getInt(this) != field2.getInt(genericObject)) {
                                    return false;
                                }
                            } else if (string.compareTo("short") == 0) {
                                if (field.getShort(this) != field2.getShort(genericObject)) {
                                    return false;
                                }
                            } else if (string.compareTo("char") == 0) {
                                if (field.getChar(this) != field2.getChar(genericObject)) {
                                    return false;
                                }
                            } else if (string.compareTo("long") == 0) {
                                if (field.getLong(this) != field2.getLong(genericObject)) {
                                    return false;
                                }
                            } else if (string.compareTo("boolean") == 0) {
                                if (field.getBoolean(this) != field2.getBoolean(genericObject)) {
                                    return false;
                                }
                            } else if (string.compareTo("double") == 0) {
                                if (field.getDouble(this) != field2.getDouble(genericObject)) {
                                    return false;
                                }
                            } else if (string.compareTo("float") == 0 && field.getFloat(this) != field2.getFloat(genericObject)) {
                                return false;
                            }
                        } else {
                            Object obj2 = field.get(this);
                            Object obj3 = field2.get(genericObject);
                            if (obj3 != null && obj2 == null) {
                                return false;
                            }
                            if ((obj3 != null || obj2 == null) && (obj3 != null || obj2 != null)) {
                                if (!(obj3 instanceof String) || !(obj2 instanceof String)) {
                                    if (isMySubclass(obj2.getClass()) && !((GenericObject) obj2).match(obj3)) {
                                        return false;
                                    }
                                    if (GenericObjectList.isMySubclass(obj2.getClass()) && !((GenericObjectList) obj2).match(obj3)) {
                                        return false;
                                    }
                                } else if (!((String) obj3).trim().equals("") && ((String) obj2).compareToIgnoreCase((String) obj3) != 0) {
                                    return false;
                                }
                            }
                        }
                    } catch (IllegalAccessException e10) {
                        InternalErrorHandler.handleException(e10);
                    }
                }
            }
        }
        return true;
    }

    public void merge(Object obj) {
        if (obj == null) {
            return;
        }
        if (!obj.getClass().equals(getClass())) {
            throw new IllegalArgumentException("Bad override object");
        }
        Class<?> superclass = getClass();
        do {
            for (Field field : superclass.getDeclaredFields()) {
                int modifiers = field.getModifiers();
                if (!Modifier.isPrivate(modifiers) && !Modifier.isStatic(modifiers) && !Modifier.isInterface(modifiers)) {
                    Class<?> type = field.getType();
                    String string = type.toString();
                    try {
                        if (!type.isPrimitive()) {
                            Object obj2 = field.get(this);
                            Object obj3 = field.get(obj);
                            if (obj3 != null) {
                                if (obj2 == null) {
                                    field.set(this, obj3);
                                } else if (obj2 instanceof GenericObject) {
                                    ((GenericObject) obj2).merge(obj3);
                                } else {
                                    field.set(this, obj3);
                                }
                            }
                        } else if (string.compareTo("int") == 0) {
                            field.setInt(this, field.getInt(obj));
                        } else if (string.compareTo("short") == 0) {
                            field.setShort(this, field.getShort(obj));
                        } else if (string.compareTo("char") == 0) {
                            field.setChar(this, field.getChar(obj));
                        } else if (string.compareTo("long") == 0) {
                            field.setLong(this, field.getLong(obj));
                        } else if (string.compareTo("boolean") == 0) {
                            field.setBoolean(this, field.getBoolean(obj));
                        } else if (string.compareTo("double") == 0) {
                            field.setDouble(this, field.getDouble(obj));
                        } else if (string.compareTo("float") == 0) {
                            field.setFloat(this, field.getFloat(obj));
                        }
                    } catch (IllegalAccessException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            superclass = superclass.getSuperclass();
        } while (!superclass.equals(GenericObject.class));
    }

    public void setMatcher(Match match) {
        if (match == null) {
            throw new IllegalArgumentException("null arg!");
        }
        this.matchExpression = match;
    }

    public void sprint(String str) {
        if (str == null) {
            this.stringRepresentation += getIndentation();
            this.stringRepresentation = AbstractC9306j0.m9891j(this.stringRepresentation, "<null>\n", new StringBuilder());
            return;
        }
        if (str.compareTo("}") == 0 || str.compareTo("]") == 0) {
            this.indentation--;
        }
        this.stringRepresentation += getIndentation();
        this.stringRepresentation = AbstractC9306j0.m9891j(this.stringRepresentation, str, new StringBuilder());
        this.stringRepresentation = AbstractC9306j0.m9891j(this.stringRepresentation, "\n", new StringBuilder());
        if (str.compareTo("{") == 0 || str.compareTo("[") == 0) {
            this.indentation++;
        }
    }

    public void dbgPrint(String str) {
        Debug.println(str);
    }

    public void sprint(Object obj) {
        sprint(obj.toString());
    }

    public void sprint(int i10) {
        sprint(String.valueOf(i10));
    }

    public void sprint(short s10) {
        sprint(String.valueOf((int) s10));
    }

    public void sprint(char c9) {
        sprint(String.valueOf(c9));
    }

    public void sprint(long j10) {
        sprint(String.valueOf(j10));
    }

    public void sprint(boolean z6) {
        sprint(String.valueOf(z6));
    }

    public void sprint(double d10) {
        sprint(String.valueOf(d10));
    }

    public void sprint(float f10) {
        sprint(String.valueOf(f10));
    }

    public String debugDump(int i10) {
        this.indentation = i10;
        String strDebugDump = debugDump();
        this.indentation = 0;
        return strDebugDump;
    }
}
