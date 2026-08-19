package p193Hf;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p072Ci.C1699d;
import p531Vj.C8347Q;
import p531Vj.C8349T;
import p729ej.C13430u;
import ve.C20584h;
import ye.C21515d;

/* JADX INFO: renamed from: Hf.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C3330S extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10177Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f10178Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3330S(boolean z6, int i10) {
        super(1);
        this.f10177Y = i10;
        this.f10178Z = z6;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f10177Y) {
            case 0:
                C21515d setState = (C21515d) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C21515d.m21794a(setState, null, null, false, null, this.f10178Z, 15);
            case 1:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                if (this.f10178Z) {
                    action.f42521b = C8349T.f26005Y;
                } else {
                    action.f42521b = C8347Q.f26003Y;
                }
                return C17296C.f55119a;
            case 2:
                C1699d settings = (C1699d) obj;
                AbstractC16544l.m18094g(settings, "settings");
                return C1699d.m2511a(settings, Boolean.valueOf(this.f10178Z), null, null, null, null, null, null, null, null, 2046);
            case 3:
                C1699d settings2 = (C1699d) obj;
                AbstractC16544l.m18094g(settings2, "settings");
                return C1699d.m2511a(settings2, null, Boolean.valueOf(this.f10178Z), null, null, null, null, null, null, null, 2045);
            case 4:
                C1699d settings3 = (C1699d) obj;
                AbstractC16544l.m18094g(settings3, "settings");
                return C1699d.m2511a(settings3, null, null, Boolean.valueOf(this.f10178Z), null, null, null, null, null, null, 2043);
            case 5:
                C1699d settings4 = (C1699d) obj;
                AbstractC16544l.m18094g(settings4, "settings");
                return C1699d.m2511a(settings4, null, null, null, null, Boolean.valueOf(this.f10178Z), null, null, null, null, 2031);
            case 6:
                C1699d settings5 = (C1699d) obj;
                AbstractC16544l.m18094g(settings5, "settings");
                return C1699d.m2511a(settings5, null, null, null, null, null, null, null, Boolean.valueOf(this.f10178Z), null, 1919);
            case 7:
                C1699d settings6 = (C1699d) obj;
                AbstractC16544l.m18094g(settings6, "settings");
                return C1699d.m2511a(settings6, null, null, null, Boolean.valueOf(this.f10178Z), null, null, null, null, null, 2039);
            case 8:
                Map currentRumContext = (Map) obj;
                AbstractC16544l.m18094g(currentRumContext, "currentRumContext");
                currentRumContext.put("view_has_replay", Boolean.valueOf(this.f10178Z));
                return C17296C.f55119a;
            default:
                C20584h c20584h = (C20584h) obj;
                if (c20584h != null) {
                    return C20584h.m21188a(c20584h, this.f10178Z, null, null, null, 14);
                }
                return null;
        }
    }
}
