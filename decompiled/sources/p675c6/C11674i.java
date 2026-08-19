package p675c6;

import p520V5.C7781j;
import p520V5.C7794w;
import p567X5.C9065o;
import p567X5.C9066p;
import p567X5.InterfaceC9053c;
import p660b6.C11249a;
import p660b6.C11250b;
import p660b6.C11252d;
import p660b6.InterfaceC11253e;
import p698d6.AbstractC13029b;

/* JADX INFO: renamed from: c6.i */
/* JADX INFO: loaded from: classes.dex */
public final class C11674i implements InterfaceC11667b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35371a = 1;

    /* JADX INFO: renamed from: b */
    public final String f35372b;

    /* JADX INFO: renamed from: c */
    public final C11250b f35373c;

    /* JADX INFO: renamed from: d */
    public final boolean f35374d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC11253e f35375e;

    /* JADX INFO: renamed from: f */
    public final Object f35376f;

    public C11674i(String str, C11250b c11250b, C11250b c11250b2, C11252d c11252d, boolean z6) {
        this.f35372b = str;
        this.f35373c = c11250b;
        this.f35375e = c11250b2;
        this.f35376f = c11252d;
        this.f35374d = z6;
    }

    @Override // p675c6.InterfaceC11667b
    /* JADX INFO: renamed from: a */
    public final InterfaceC9053c mo12679a(C7794w c7794w, C7781j c7781j, AbstractC13029b abstractC13029b) {
        switch (this.f35371a) {
            case 0:
                return new C9065o(c7794w, abstractC13029b, this);
            default:
                return new C9066p(c7794w, abstractC13029b, this);
        }
    }

    public String toString() {
        switch (this.f35371a) {
            case 0:
                return "RectangleShape{position=" + this.f35375e + ", size=" + ((C11249a) this.f35376f) + '}';
            default:
                return super.toString();
        }
    }

    public C11674i(String str, InterfaceC11253e interfaceC11253e, C11249a c11249a, C11250b c11250b, boolean z6) {
        this.f35372b = str;
        this.f35375e = interfaceC11253e;
        this.f35376f = c11249a;
        this.f35373c = c11250b;
        this.f35374d = z6;
    }
}
