package p021Aj;

import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1156zj.C22147d0;
import p1156zj.C22195t0;
import p994rk.C19067A1;
import p994rk.InterfaceC19099L0;

/* JADX INFO: renamed from: Aj.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C0525j implements InterfaceC19099L0 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C22195t0 f1683Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ArrayList f1684Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C22147d0 f1685o0;

    public C0525j(C22195t0 c22195t0, ArrayList arrayList, C22147d0 c22147d0) {
        this.f1683Y = c22195t0;
        this.f1684Z = arrayList;
        this.f1685o0 = c22147d0;
    }

    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: a */
    public final UiComponentConfig.InputSelectComponentStyle mo1128a() {
        StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle;
        StepStyles.InputSelectStyleContainer base;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.f1683Y.f70344j;
        if (governmentIdStepStyle == null || (inputSelectStyle = governmentIdStepStyle.getInputSelectStyle()) == null || (base = inputSelectStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: c */
    public final List mo1129c() {
        ArrayList arrayList = this.f1684Z;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (AbstractC16544l.m18089b(((C19067A1) obj).f60745Z, this.f1685o0.f70018w0)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: d */
    public final String mo1130d() {
        return null;
    }

    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: g */
    public final boolean mo1131g() {
        return false;
    }

    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: j */
    public final List mo1132j() {
        return this.f1684Z;
    }
}
