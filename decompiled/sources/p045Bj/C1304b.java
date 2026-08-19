package p045Bj;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1156zj.C22090C;
import p1156zj.C22139a1;
import p1156zj.C22153f0;
import p1156zj.C22177n0;
import p1156zj.InterfaceC22179o;
import p125Ej.InterfaceC2564h;
import p729ej.C13430u;

/* JADX INFO: renamed from: Bj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C1304b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3441Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2564h f3442Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1304b(InterfaceC2564h interfaceC2564h, int i10) {
        super(1);
        this.f3441Y = i10;
        this.f3442Z = interfaceC2564h;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f3441Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                Object obj2 = action.f42521b;
                C22153f0 c22153f0 = obj2 instanceof C22153f0 ? (C22153f0) obj2 : null;
                if (c22153f0 != null) {
                    C22139a1 currentPart = c22153f0.f70037Z;
                    AbstractC16544l.m18094g(currentPart, "currentPart");
                    List uploadingIds = c22153f0.f70038o0;
                    AbstractC16544l.m18094g(uploadingIds, "uploadingIds");
                    InterfaceC22179o captureConfig = c22153f0.f70039p0;
                    AbstractC16544l.m18094g(captureConfig, "captureConfig");
                    C22090C idForReview = c22153f0.f70040q0;
                    AbstractC16544l.m18094g(idForReview, "idForReview");
                    List parts = c22153f0.f70041r0;
                    AbstractC16544l.m18094g(parts, "parts");
                    action.f42521b = new C22153f0(currentPart, uploadingIds, captureConfig, idForReview, parts, c22153f0.f70042s0, c22153f0.f70043t0, this.f3442Z);
                }
                break;
            default:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                Object obj3 = action2.f42521b;
                C22177n0 c22177n0 = obj3 instanceof C22177n0 ? (C22177n0) obj3 : null;
                if (c22177n0 != null) {
                    action2.f42521b = C22177n0.m22397i(c22177n0, null, null, null, false, false, this.f3442Z, 12287);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
