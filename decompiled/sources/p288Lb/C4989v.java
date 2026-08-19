package p288Lb;

import com.google.gson.reflect.TypeToken;
import p214Ib.AbstractC3656B;
import p214Ib.C3669l;
import p214Ib.InterfaceC3657C;

/* JADX INFO: renamed from: Lb.v */
/* JADX INFO: loaded from: classes.dex */
public final class C4989v implements InterfaceC3657C {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Class f16265Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Class f16266Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC3656B f16267o0;

    public C4989v(Class cls, Class cls2, AbstractC3656B abstractC3656B) {
        this.f16265Y = cls;
        this.f16266Z = cls2;
        this.f16267o0 = abstractC3656B;
    }

    @Override // p214Ib.InterfaceC3657C
    /* JADX INFO: renamed from: a */
    public final AbstractC3656B mo4360a(C3669l c3669l, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (rawType == this.f16265Y || rawType == this.f16266Z) {
            return this.f16267o0;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f16266Z.getName() + "+" + this.f16265Y.getName() + ",adapter=" + this.f16267o0 + "]";
    }
}
