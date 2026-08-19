package p288Lb;

import com.google.gson.reflect.TypeToken;
import p214Ib.AbstractC3656B;
import p214Ib.C3669l;
import p214Ib.InterfaceC3657C;
import p214Ib.InterfaceC3672o;

/* JADX INFO: renamed from: Lb.r */
/* JADX INFO: loaded from: classes.dex */
public final class C4985r implements InterfaceC3657C {

    /* JADX INFO: renamed from: Y */
    public final TypeToken f16248Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f16249Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC3672o f16250o0;

    public C4985r(InterfaceC3672o interfaceC3672o, TypeToken typeToken, boolean z6) {
        this.f16250o0 = interfaceC3672o;
        this.f16248Y = typeToken;
        this.f16249Z = z6;
    }

    @Override // p214Ib.InterfaceC3657C
    /* JADX INFO: renamed from: a */
    public final AbstractC3656B mo4360a(C3669l c3669l, TypeToken typeToken) {
        TypeToken typeToken2 = this.f16248Y;
        if (typeToken2 == null) {
            typeToken.getRawType();
            throw null;
        }
        if (typeToken2.equals(typeToken) || (this.f16249Z && typeToken2.getType() == typeToken.getRawType())) {
            return new C4986s(this.f16250o0, c3669l, typeToken, this, true);
        }
        return null;
    }
}
