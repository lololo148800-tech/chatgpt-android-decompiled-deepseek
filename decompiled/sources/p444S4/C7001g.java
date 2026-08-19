package p444S4;

import io.sentry.android.core.AbstractC15256t;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: S4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7001g {

    /* JADX INFO: renamed from: b */
    public static final String f22406b = C7011q.m7409f("Data");

    /* JADX INFO: renamed from: c */
    public static final C7001g f22407c;

    /* JADX INFO: renamed from: a */
    public final HashMap f22408a;

    static {
        C7001g c7001g = new C7001g(new HashMap());
        m7402b(c7001g);
        f22407c = c7001g;
    }

    public C7001g(C7001g c7001g) {
        this.f22408a = new HashMap(c7001g.f22408a);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static C7001g m7401a(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable e10;
        String str = f22406b;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i10 = objectInputStream.readInt(); i10 > 0; i10--) {
                            map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e11) {
                            AbstractC15256t.m16466d(str, "Error in Data#fromByteArray: ", e11);
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e12) {
                        e10 = e12;
                        AbstractC15256t.m16466d(str, "Error in Data#fromByteArray: ", e10);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e13) {
                                AbstractC15256t.m16466d(str, "Error in Data#fromByteArray: ", e13);
                            }
                        }
                        byteArrayInputStream.close();
                    } catch (ClassNotFoundException e14) {
                        e10 = e14;
                        AbstractC15256t.m16466d(str, "Error in Data#fromByteArray: ", e10);
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                    }
                } catch (IOException e15) {
                    AbstractC15256t.m16466d(str, "Error in Data#fromByteArray: ", e15);
                }
            } catch (IOException e16) {
                e = e16;
                Throwable th2 = e;
                objectInputStream = null;
                e10 = th2;
                AbstractC15256t.m16466d(str, "Error in Data#fromByteArray: ", e10);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new C7001g(map);
            } catch (ClassNotFoundException e17) {
                e = e17;
                Throwable th3 = e;
                objectInputStream = null;
                e10 = th3;
                AbstractC15256t.m16466d(str, "Error in Data#fromByteArray: ", e10);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new C7001g(map);
            } catch (Throwable th4) {
                th = th4;
                if (0 != 0) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e18) {
                        AbstractC15256t.m16466d(str, "Error in Data#fromByteArray: ", e18);
                    }
                }
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (IOException e19) {
                    AbstractC15256t.m16466d(str, "Error in Data#fromByteArray: ", e19);
                    throw th;
                }
            }
            return new C7001g(map);
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m7402b(C7001g c7001g) throws Throwable {
        String str = f22406b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(c7001g.f22408a.size());
                    for (Map.Entry entry : c7001g.f22408a.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e10) {
                        AbstractC15256t.m16466d(str, "Error in Data#toByteArray: ", e10);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        AbstractC15256t.m16466d(str, "Error in Data#toByteArray: ", e11);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e12) {
                    e = e12;
                    objectOutputStream = objectOutputStream2;
                    AbstractC15256t.m16466d(str, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e13) {
                            AbstractC15256t.m16466d(str, "Error in Data#toByteArray: ", e13);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e14) {
                        AbstractC15256t.m16466d(str, "Error in Data#toByteArray: ", e14);
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e15) {
                            AbstractC15256t.m16466d(str, "Error in Data#toByteArray: ", e15);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e16) {
                        AbstractC15256t.m16466d(str, "Error in Data#toByteArray: ", e16);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e17) {
            e = e17;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7001g.class != obj.getClass()) {
            return false;
        }
        HashMap map = this.f22408a;
        Set<String> setKeySet = map.keySet();
        HashMap map2 = ((C7001g) obj).f22408a;
        if (!setKeySet.equals(map2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = map.get(str);
            Object obj3 = map2.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f22408a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        HashMap map = this.f22408a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = map.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public C7001g(HashMap map) {
        this.f22408a = new HashMap(map);
    }
}
