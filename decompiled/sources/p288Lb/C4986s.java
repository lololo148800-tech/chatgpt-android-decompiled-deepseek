package p288Lb;

import com.google.gson.reflect.TypeToken;
import p214Ib.AbstractC3656B;
import p214Ib.AbstractC3673p;
import p214Ib.C3669l;
import p214Ib.C3675r;
import p214Ib.InterfaceC3672o;
import p265Kb.AbstractC4611d;
import p379Pb.C6381b;
import p379Pb.C6382c;
import p960q9.C18655i;

/* JADX INFO: renamed from: Lb.s */
/* JADX INFO: loaded from: classes.dex */
public final class C4986s extends AbstractC4984q {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3672o f16251a;

    /* JADX INFO: renamed from: b */
    public final C3669l f16252b;

    /* JADX INFO: renamed from: c */
    public final TypeToken f16253c;

    /* JADX INFO: renamed from: d */
    public final C4985r f16254d;

    /* JADX INFO: renamed from: e */
    public final C18655i f16255e = new C18655i(this, 11);

    /* JADX INFO: renamed from: f */
    public final boolean f16256f;

    /* JADX INFO: renamed from: g */
    public volatile AbstractC3656B f16257g;

    public C4986s(InterfaceC3672o interfaceC3672o, C3669l c3669l, TypeToken typeToken, C4985r c4985r, boolean z6) {
        this.f16251a = interfaceC3672o;
        this.f16252b = c3669l;
        this.f16253c = typeToken;
        this.f16254d = c4985r;
        this.f16256f = z6;
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: a */
    public final Object mo4358a(C6381b c6381b) {
        InterfaceC3672o interfaceC3672o = this.f16251a;
        if (interfaceC3672o == null) {
            return m5643d().mo4358a(c6381b);
        }
        AbstractC3673p abstractC3673pM5350i = AbstractC4611d.m5350i(c6381b);
        if (this.f16256f) {
            abstractC3673pM5350i.getClass();
            if (abstractC3673pM5350i instanceof C3675r) {
                return null;
            }
        }
        return interfaceC3672o.mo4388a(abstractC3673pM5350i, this.f16253c.getType(), this.f16255e);
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: b */
    public final void mo4359b(C6382c c6382c, Object obj) {
        m5643d().mo4359b(c6382c, obj);
    }

    @Override // p288Lb.AbstractC4984q
    /* JADX INFO: renamed from: c */
    public final AbstractC3656B mo4366c() {
        return m5643d();
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC3656B m5643d() {
        AbstractC3656B abstractC3656B = this.f16257g;
        if (abstractC3656B != null) {
            return abstractC3656B;
        }
        AbstractC3656B abstractC3656BM4373g = this.f16252b.m4373g(this.f16254d, this.f16253c);
        this.f16257g = abstractC3656BM4373g;
        return abstractC3656BM4373g;
    }
}
