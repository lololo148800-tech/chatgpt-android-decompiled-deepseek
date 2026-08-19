package p288Lb;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;
import p214Ib.AbstractC3656B;
import p214Ib.C3669l;
import p240Jb.InterfaceC4325b;
import p379Pb.C6381b;
import p379Pb.C6382c;

/* JADX INFO: renamed from: Lb.t */
/* JADX INFO: loaded from: classes.dex */
public final class C4987t extends AbstractC3656B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16258a;

    /* JADX INFO: renamed from: b */
    public final Object f16259b;

    /* JADX INFO: renamed from: c */
    public final Object f16260c;

    /* JADX INFO: renamed from: d */
    public final Object f16261d;

    public C4987t(C3669l c3669l, AbstractC3656B abstractC3656B, Type type) {
        this.f16258a = 0;
        this.f16259b = c3669l;
        this.f16260c = abstractC3656B;
        this.f16261d = type;
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: a */
    public final Object mo4358a(C6381b c6381b) throws IOException {
        switch (this.f16258a) {
            case 0:
                return ((AbstractC3656B) this.f16260c).mo4358a(c6381b);
            default:
                if (c6381b.mo5616N0() == 9) {
                    c6381b.mo5627e0();
                    return null;
                }
                String strMo5634x = c6381b.mo5634x();
                Enum r6 = (Enum) ((HashMap) this.f16259b).get(strMo5634x);
                return r6 == null ? (Enum) ((HashMap) this.f16260c).get(strMo5634x) : r6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: b */
    public final void mo4359b(C6382c c6382c, Object obj) throws IOException {
        AbstractC3656B abstractC3656BMo4366c;
        switch (this.f16258a) {
            case 0:
                Type type = (Type) this.f16261d;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                AbstractC3656B abstractC3656B = (AbstractC3656B) this.f16260c;
                if (type2 != type) {
                    AbstractC3656B abstractC3656BM4372f = ((C3669l) this.f16259b).m4372f(TypeToken.get(type2));
                    if (abstractC3656BM4372f instanceof AbstractC4980m) {
                        AbstractC3656B abstractC3656B2 = abstractC3656B;
                        while ((abstractC3656B2 instanceof AbstractC4984q) && (abstractC3656BMo4366c = ((AbstractC4984q) abstractC3656B2).mo4366c()) != abstractC3656B2) {
                            abstractC3656B2 = abstractC3656BMo4366c;
                        }
                        if (abstractC3656B2 instanceof AbstractC4980m) {
                            abstractC3656B = abstractC3656BM4372f;
                        }
                    } else {
                        abstractC3656B = abstractC3656BM4372f;
                    }
                }
                abstractC3656B.mo4359b(c6382c, obj);
                break;
            default:
                Enum r6 = (Enum) obj;
                c6382c.m7010J0(r6 == null ? null : (String) ((HashMap) this.f16261d).get(r6));
                break;
        }
    }

    public C4987t(Class cls) {
        this.f16258a = 1;
        this.f16259b = new HashMap();
        this.f16260c = new HashMap();
        this.f16261d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new C4991x(cls))) {
                Enum r6 = (Enum) field.get(null);
                String strName = r6.name();
                String string = r6.toString();
                InterfaceC4325b interfaceC4325b = (InterfaceC4325b) field.getAnnotation(InterfaceC4325b.class);
                if (interfaceC4325b != null) {
                    strName = interfaceC4325b.value();
                    for (String str : interfaceC4325b.alternate()) {
                        ((HashMap) this.f16259b).put(str, r6);
                    }
                }
                ((HashMap) this.f16259b).put(strName, r6);
                ((HashMap) this.f16260c).put(string, r6);
                ((HashMap) this.f16261d).put(r6, strName);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }
}
