package p389Pn;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p412Qn.InterfaceC6762c;
import p437Rn.C6960r;

/* JADX INFO: renamed from: Pn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C6520e extends C6522g {

    /* JADX INFO: renamed from: b */
    public final InterfaceC6762c f21129b;

    /* JADX INFO: renamed from: c */
    public final C6960r f21130c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6520e(ArrayList formats) {
        super(formats);
        AbstractC16544l.m18094g(formats, "formats");
        this.f21129b = super.mo7085a();
        this.f21130c = super.mo7086b();
    }

    @Override // p389Pn.C6522g, p389Pn.InterfaceC6527l
    /* JADX INFO: renamed from: a */
    public final InterfaceC6762c mo7085a() {
        return this.f21129b;
    }

    @Override // p389Pn.C6522g, p389Pn.InterfaceC6527l
    /* JADX INFO: renamed from: b */
    public final C6960r mo7086b() {
        return this.f21130c;
    }
}
