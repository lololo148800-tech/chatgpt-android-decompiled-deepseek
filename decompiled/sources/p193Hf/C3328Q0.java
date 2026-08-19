package p193Hf;

import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModel;
import java.util.List;
import mm.C17296C;
import p103Dn.C2153Q0;
import p103Dn.InterfaceC2186j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Hf.Q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3328Q0 implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f10161Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ CanmoreViewModel f10162Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f10163o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f10164p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ String f10165q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ List f10166r0;

    public C3328Q0(boolean z6, CanmoreViewModel canmoreViewModel, String str, String str2, String str3, List list) {
        this.f10161Y = z6;
        this.f10162Z = canmoreViewModel;
        this.f10163o0 = str;
        this.f10164p0 = str2;
        this.f10165q0 = str3;
        this.f10166r0 = list;
    }

    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        C3324O0 c3324o0 = (C3324O0) obj;
        C2153Q0 c2153q0 = this.f10162Z.f40343c;
        Object objM4167b = c3324o0.m4167b(this.f10161Y, ((C3420z0) c2153q0.getValue()).f10416a, this.f10163o0, this.f10164p0, ((C3420z0) c2153q0.getValue()).f10418c, this.f10165q0, this.f10166r0, interfaceC18770c);
        return objM4167b == EnumC19250a.f61036Y ? objM4167b : C17296C.f55119a;
    }
}
