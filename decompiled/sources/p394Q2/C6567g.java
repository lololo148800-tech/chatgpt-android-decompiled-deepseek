package p394Q2;

import androidx.datastore.preferences.protobuf.AbstractC10949b;
import androidx.datastore.preferences.protobuf.AbstractC10983s;
import androidx.datastore.preferences.protobuf.AbstractC10987u;
import androidx.datastore.preferences.protobuf.AbstractC10993x;
import androidx.datastore.preferences.protobuf.C10945Y;
import androidx.datastore.preferences.protobuf.C10946Z;
import androidx.datastore.preferences.protobuf.C10957f;
import androidx.datastore.preferences.protobuf.C10985t;
import androidx.datastore.preferences.protobuf.InterfaceC10924C;
import androidx.datastore.preferences.protobuf.InterfaceC10942V;
import androidx.datastore.preferences.protobuf.InterfaceC10943W;
import androidx.datastore.preferences.protobuf.InterfaceC10991w;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: Q2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6567g extends AbstractC10987u {
    private static final C6567g DEFAULT_INSTANCE;
    private static volatile InterfaceC10942V PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC10991w strings_ = C10945Y.f33006p0;

    static {
        C6567g c6567g = new C6567g();
        DEFAULT_INSTANCE = c6567g;
        AbstractC10987u.m11717h(C6567g.class, c6567g);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    public static void m7131i(C6567g c6567g, Iterable iterable) {
        InterfaceC10991w interfaceC10991w = c6567g.strings_;
        if (!((AbstractC10949b) interfaceC10991w).f33013Y) {
            int size = interfaceC10991w.size();
            c6567g.strings_ = interfaceC10991w.mo11431b(size == 0 ? 10 : size * 2);
        }
        List list = c6567g.strings_;
        Charset charset = AbstractC10993x.f33099a;
        iterable.getClass();
        if (iterable instanceof InterfaceC10924C) {
            List underlyingElements = ((InterfaceC10924C) iterable).getUnderlyingElements();
            InterfaceC10924C interfaceC10924C = (InterfaceC10924C) list;
            int size2 = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC10924C.size() - size2) + " is null.";
                    for (int size3 = interfaceC10924C.size() - 1; size3 >= size2; size3--) {
                        interfaceC10924C.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof C10957f) {
                    interfaceC10924C.mo11433l((C10957f) obj);
                } else {
                    interfaceC10924C.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC10943W) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size4) + " is null.";
                for (int size5 = list.size() - 1; size5 >= size4; size5--) {
                    list.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static C6567g m7132j() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static C6566f m7133l() {
        return (C6566f) ((AbstractC10983s) DEFAULT_INSTANCE.mo7129d(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10987u
    /* JADX INFO: renamed from: d */
    public final Object mo7129d(int i10) {
        switch (AbstractC0010F.m24h(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C10946Z(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new C6567g();
            case 4:
                return new C6566f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC10942V c10985t = PARSER;
                if (c10985t == null) {
                    synchronized (C6567g.class) {
                        try {
                            c10985t = PARSER;
                            if (c10985t == null) {
                                c10985t = new C10985t();
                                PARSER = c10985t;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return c10985t;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC10991w m7134k() {
        return this.strings_;
    }
}
