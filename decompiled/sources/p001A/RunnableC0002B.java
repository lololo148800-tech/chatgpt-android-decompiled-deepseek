package p001A;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import p228J.C3796C0;
import p228J.C3836g;
import p228J.C3865u0;
import p228J.InterfaceC3800E0;

/* JADX INFO: renamed from: A.B */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0002B implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0018J f6Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f7o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C3865u0 f8p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC3800E0 f9q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C3836g f10r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ ArrayList f11s0;

    public /* synthetic */ RunnableC0002B(C0018J c0018j, String str, C3865u0 c3865u0, InterfaceC3800E0 interfaceC3800E0, C3836g c3836g, ArrayList arrayList, int i10) {
        this.f5Y = i10;
        this.f6Z = c0018j;
        this.f7o0 = str;
        this.f8p0 = c3865u0;
        this.f9q0 = interfaceC3800E0;
        this.f10r0 = c3836g;
        this.f11s0 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5Y) {
            case 0:
                C0018J c0018j = this.f6Z;
                c0018j.getClass();
                StringBuilder sb2 = new StringBuilder("Use case ");
                String str = this.f7o0;
                sb2.append(str);
                sb2.append(" UPDATED");
                c0018j.m126v(sb2.toString(), null);
                c0018j.f90Y.m21921B(str, this.f8p0, this.f9q0, this.f10r0, this.f11s0);
                c0018j.m103M();
                break;
            default:
                C0018J c0018j2 = this.f6Z;
                c0018j2.getClass();
                StringBuilder sb3 = new StringBuilder("Use case ");
                String str2 = this.f7o0;
                sb3.append(str2);
                sb3.append(" ACTIVE");
                c0018j2.m126v(sb3.toString(), null);
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0018j2.f90Y.f68345o0;
                C3796C0 c3796c0 = (C3796C0) linkedHashMap.get(str2);
                C3865u0 c3865u0 = this.f8p0;
                InterfaceC3800E0 interfaceC3800E0 = this.f9q0;
                C3836g c3836g = this.f10r0;
                ArrayList arrayList = this.f11s0;
                if (c3796c0 == null) {
                    c3796c0 = new C3796C0(c3865u0, interfaceC3800E0, c3836g, arrayList);
                    linkedHashMap.put(str2, c3796c0);
                }
                c3796c0.f11477f = true;
                c0018j2.f90Y.m21921B(str2, c3865u0, interfaceC3800E0, c3836g, arrayList);
                c0018j2.m103M();
                break;
        }
    }
}
