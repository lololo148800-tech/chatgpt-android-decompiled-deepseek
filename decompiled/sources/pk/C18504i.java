package pk;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p310M9.C5311e;
import p769gj.C14182x;
import p769gj.InterfaceC14147A;
import p769gj.InterfaceC14161c;
import p858ko.C16482A;

/* JADX INFO: renamed from: pk.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C18504i implements InterfaceC14161c {

    /* JADX INFO: renamed from: Y */
    public final C18500e f58967Y;

    /* JADX INFO: renamed from: Z */
    public final List f58968Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC16546n f58969o0;

    /* JADX INFO: renamed from: p0 */
    public final String f58970p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f58971q0;

    /* JADX INFO: renamed from: r0 */
    public C5311e f58972r0;

    /* JADX INFO: renamed from: s0 */
    public BottomSheetBehavior f58973s0;

    /* JADX INFO: renamed from: t0 */
    public final C14182x f58974t0;

    /* JADX WARN: Multi-variable type inference failed */
    public C18504i(C18500e uiScreen, List list, InterfaceC1426a interfaceC1426a, String str, boolean z6) {
        AbstractC16544l.m18094g(uiScreen, "uiScreen");
        this.f58967Y = uiScreen;
        this.f58968Z = list;
        this.f58969o0 = (AbstractC16546n) interfaceC1426a;
        this.f58970p0 = str;
        this.f58971q0 = z6;
        this.f58974t0 = new C14182x(AbstractC16526C.f51263a.mo5693b(C18504i.class), C18501f.f58962Y, new C16482A(this, 16));
    }

    @Override // p769gj.InterfaceC14161c
    /* JADX INFO: renamed from: a */
    public final InterfaceC14147A mo1134a() {
        return this.f58974t0;
    }
}
