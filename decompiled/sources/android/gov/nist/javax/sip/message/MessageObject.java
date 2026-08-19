package android.gov.nist.javax.sip.message;

import android.gov.nist.core.GenericObject;
import android.gov.nist.core.GenericObjectList;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class MessageObject extends GenericObject {
    @Override // android.gov.nist.core.GenericObject
    public void dbgPrint() {
        super.dbgPrint();
    }

    @Override // android.gov.nist.core.GenericObject
    public String debugDump() {
        this.stringRepresentation = "";
        Class<?> cls = getClass();
        sprint(cls.getName());
        sprint("{");
        for (Field field : cls.getDeclaredFields()) {
            if (field.getModifiers() != 2) {
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
                    }
                }
            }
        }
        sprint("}");
        return this.stringRepresentation;
    }

    @Override // android.gov.nist.core.GenericObject
    public abstract String encode();

    public String dbgPrint(int i10) {
        int i11 = this.indentation;
        this.indentation = i10;
        String string = toString();
        this.indentation = i11;
        return string;
    }
}
