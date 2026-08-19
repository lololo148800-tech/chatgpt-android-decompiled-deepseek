package android.gov.nist.core;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes.dex */
public abstract class GenericObjectList extends LinkedList<GenericObject> implements Serializable, Cloneable {
    protected static final String AND = "&";

    /* JADX INFO: renamed from: AT */
    protected static final String f31981AT = "@";
    protected static final String COLON = ":";
    protected static final String COMMA = ",";
    protected static final String DOT = ".";
    protected static final String DOUBLE_QUOTE = "\"";
    protected static final String EQUALS = "=";
    protected static final String GREATER_THAN = ">";

    /* JADX INFO: renamed from: HT */
    protected static final String f31982HT = "\t";
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
    protected static final String f31983SP = " ";
    protected static final String STAR = "*";

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ int f31984Y = 0;
    protected int indentation;
    protected String listName;
    protected Class<?> myClass;
    private ListIterator<? extends GenericObject> myListIterator;
    private String stringRep;

    public GenericObjectList() {
        this.listName = null;
        this.stringRep = "";
    }

    public static boolean isCloneable(Object obj) {
        return obj instanceof Cloneable;
    }

    public static boolean isMySubclass(Class<?> cls) {
        return GenericObjectList.class.isAssignableFrom(cls);
    }

    private void sprint(String str) {
        if (str == null) {
            this.stringRep += getIndentation();
            this.stringRep = AbstractC9306j0.m9891j(this.stringRep, "<null>\n", new StringBuilder());
            return;
        }
        if (str.compareTo("}") == 0 || str.compareTo("]") == 0) {
            this.indentation--;
        }
        this.stringRep += getIndentation();
        this.stringRep = AbstractC9306j0.m9891j(this.stringRep, str, new StringBuilder());
        this.stringRep = AbstractC9306j0.m9891j(this.stringRep, "\n", new StringBuilder());
        if (str.compareTo("{") == 0 || str.compareTo("[") == 0) {
            this.indentation++;
        }
    }

    @Override // java.util.LinkedList
    public Object clone() {
        GenericObjectList genericObjectList = (GenericObjectList) super.clone();
        ListIterator<GenericObject> listIterator = genericObjectList.listIterator();
        while (listIterator.hasNext()) {
            listIterator.set((GenericObject) listIterator.next().clone());
        }
        return genericObjectList;
    }

    public void concatenate(GenericObjectList genericObjectList) {
        concatenate(genericObjectList, false);
    }

    public String debugDump() {
        this.stringRep = "";
        GenericObject genericObjectFirst = first();
        if (genericObjectFirst == null) {
            return "<null>";
        }
        sprint("listName:");
        sprint(this.listName);
        sprint("{");
        while (genericObjectFirst != null) {
            sprint("[");
            sprint(genericObjectFirst.debugDump(this.indentation));
            genericObjectFirst = next();
            sprint("]");
        }
        sprint("}");
        return this.stringRep;
    }

    public String encode() {
        if (isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        ListIterator<GenericObject> listIterator = listIterator();
        if (listIterator.hasNext()) {
            while (true) {
                GenericObject next = listIterator.next();
                if (next instanceof GenericObject) {
                    sb2.append(next.encode());
                } else {
                    sb2.append(next.toString());
                }
                if (!listIterator.hasNext()) {
                    break;
                }
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        GenericObjectList genericObjectList = (GenericObjectList) obj;
        if (size() != genericObjectList.size()) {
            return false;
        }
        ListIterator<GenericObject> listIterator = listIterator();
        while (listIterator.hasNext()) {
            do {
                try {
                } catch (NoSuchElementException unused) {
                    return false;
                }
            } while (!listIterator.next().equals(genericObjectList.listIterator().next()));
        }
        ListIterator<GenericObject> listIterator2 = genericObjectList.listIterator();
        while (listIterator2.hasNext()) {
            do {
                try {
                } catch (NoSuchElementException unused2) {
                    return false;
                }
            } while (!listIterator2.next().equals(listIterator().next()));
        }
        return true;
    }

    public GenericObject first() {
        ListIterator<GenericObject> listIterator = listIterator(0);
        this.myListIterator = listIterator;
        try {
            return listIterator.next();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public String getIndentation() {
        char[] cArr = new char[this.indentation];
        Arrays.fill(cArr, ' ');
        return new String(cArr);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return 42;
    }

    public boolean match(Object obj) {
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        ListIterator<GenericObject> listIterator = ((GenericObjectList) obj).listIterator();
        if (!listIterator.hasNext()) {
            return true;
        }
        GenericObject next = listIterator.next();
        ListIterator<GenericObject> listIterator2 = listIterator();
        while (listIterator2.hasNext()) {
            Cloneable next2 = listIterator2.next();
            if (next2 instanceof GenericObject) {
                System.out.println("Trying to match  = " + ((GenericObject) next2).encode());
            }
            if (GenericObject.isMySubclass(next2.getClass()) && ((GenericObject) next2).match(next)) {
                return true;
            }
            if (isMySubclass(next2.getClass()) && ((GenericObjectList) next2).match(next)) {
                return true;
            }
        }
        System.out.println(next.encode());
        return false;
    }

    public void mergeObjects(GenericObjectList genericObjectList) {
        if (genericObjectList == null) {
            return;
        }
        ListIterator<GenericObject> listIterator = listIterator();
        ListIterator<GenericObject> listIterator2 = genericObjectList.listIterator();
        while (listIterator.hasNext()) {
            GenericObject next = listIterator.next();
            while (listIterator2.hasNext()) {
                next.merge(listIterator2.next());
            }
        }
    }

    public GenericObject next(ListIterator listIterator) {
        try {
            return (GenericObject) listIterator.next();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public void setMyClass(Class cls) {
        this.myClass = cls;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return encode();
    }

    @Override // java.util.LinkedList, java.util.Deque
    public void addFirst(GenericObject genericObject) {
        if (this.myClass == null) {
            this.myClass = genericObject.getClass();
        } else {
            super.addFirst(genericObject);
        }
    }

    public void concatenate(GenericObjectList genericObjectList, boolean z6) {
        if (z6) {
            addAll(0, genericObjectList);
        } else {
            addAll(genericObjectList);
        }
    }

    public GenericObject next() {
        if (this.myListIterator == null) {
            this.myListIterator = listIterator(0);
        }
        try {
            return this.myListIterator.next();
        } catch (NoSuchElementException unused) {
            this.myListIterator = null;
            return null;
        }
    }

    public GenericObjectList(String str) {
        this();
        this.listName = str;
    }

    public GenericObjectList(String str, String str2) {
        this(str);
        try {
            this.myClass = Class.forName(str2);
        } catch (ClassNotFoundException e10) {
            InternalErrorHandler.handleException(e10);
        }
    }

    public GenericObjectList(String str, Class cls) {
        this(str);
        this.myClass = cls;
    }

    public String debugDump(int i10) {
        int i11 = this.indentation;
        this.indentation = i10;
        String strDebugDump = debugDump();
        this.indentation = i11;
        return strDebugDump;
    }
}
