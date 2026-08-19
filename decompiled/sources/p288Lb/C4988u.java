package p288Lb;

import com.google.gson.reflect.TypeToken;
import p214Ib.AbstractC3656B;
import p214Ib.C3669l;
import p214Ib.InterfaceC3657C;

/* JADX INFO: renamed from: Lb.u */
/* JADX INFO: loaded from: classes.dex */
public final class C4988u implements InterfaceC3657C {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16262Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f16263Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC3656B f16264o0;

    public /* synthetic */ C4988u(Object obj, AbstractC3656B abstractC3656B, int i10) {
        this.f16262Y = i10;
        this.f16263Z = obj;
        this.f16264o0 = abstractC3656B;
    }

    @Override // p214Ib.InterfaceC3657C
    /* JADX INFO: renamed from: a */
    public final AbstractC3656B mo4360a(C3669l c3669l, TypeToken typeToken) {
        switch (this.f16262Y) {
            case 0:
                if (typeToken.getRawType() == ((Class) this.f16263Z)) {
                    return this.f16264o0;
                }
                return null;
            case 1:
                Class<?> rawType = typeToken.getRawType();
                if (((Class) this.f16263Z).isAssignableFrom(rawType)) {
                    return new C4969b(this, rawType);
                }
                return null;
            default:
                if (typeToken.equals((TypeToken) this.f16263Z)) {
                    return this.f16264o0;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f16262Y) {
            case 0:
                return "Factory[type=" + ((Class) this.f16263Z).getName() + ",adapter=" + this.f16264o0 + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f16263Z).getName() + ",adapter=" + this.f16264o0 + "]";
            default:
                return super.toString();
        }
    }
}
