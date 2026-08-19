package p100Dk;

import bj.C11447L;
import com.withpersona.sdk2.inquiry.p689ui.network.C12909a;
import java.util.Map;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p1131yj.InterfaceC21546a;
import p523V9.AbstractC8191s5;
import p729ej.InterfaceC13427r;
import p770gk.InterfaceC14185a;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: Dk.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C2073A implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final String f6398b;

    /* JADX INFO: renamed from: c */
    public final String f6399c;

    /* JADX INFO: renamed from: d */
    public final String f6400d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC19201o2 f6401e;

    /* JADX INFO: renamed from: f */
    public final Map f6402f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2094u f6403g;

    /* JADX INFO: renamed from: h */
    public final C11447L f6404h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC14185a f6405i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC21546a f6406j;

    public C2073A(String str, String str2, String str3, InterfaceC19201o2 interfaceC19201o2, Map map, InterfaceC2094u interfaceC2094u, C11447L c11447l, InterfaceC14185a interfaceC14185a, InterfaceC21546a interfaceC21546a) {
        this.f6398b = str;
        this.f6399c = str2;
        this.f6400d = str3;
        this.f6401e = interfaceC19201o2;
        this.f6402f = map;
        this.f6403g = interfaceC2094u;
        this.f6404h = c11447l;
        this.f6405i = interfaceC14185a;
        this.f6406j = interfaceC21546a;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r interfaceC13427r) {
        return AbstractC8191s5.m8780h(this, interfaceC13427r);
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C12909a(this, null));
    }
}
