package p021Aj;

import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1156zj.C22134Y0;
import p1156zj.C22147d0;
import p1156zj.C22195t0;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p994rk.C19067A1;
import p994rk.InterfaceC19099L0;

/* JADX INFO: renamed from: Aj.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C0524i implements InterfaceC19099L0 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C22195t0 f1681Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22147d0 f1682Z;

    public C0524i(C22195t0 c22195t0, C22147d0 c22147d0) {
        this.f1681Y = c22195t0;
        this.f1682Z = c22147d0;
    }

    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: a */
    public final UiComponentConfig.InputSelectComponentStyle mo1128a() {
        StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle;
        StepStyles.InputSelectStyleContainer base;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.f1681Y.f70344j;
        if (governmentIdStepStyle == null || (inputSelectStyle = governmentIdStepStyle.getInputSelectStyle()) == null || (base = inputSelectStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: c */
    public final List mo1129c() {
        Object next;
        C22147d0 c22147d0 = this.f1682Z;
        Iterator it = c22147d0.f70016u0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC16544l.m18089b(((C22134Y0) next).f69971Z, c22147d0.f70017v0));
        C22134Y0 c22134y0 = (C22134Y0) next;
        return c22134y0 != null ? AbstractC9393x3.m9974d(new C19067A1(c22134y0.f69970Y, c22134y0.f69971Z)) : C17689w.f56480Y;
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
        List<C22134Y0> list = this.f1682Z.f70016u0;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (C22134Y0 c22134y0 : list) {
            arrayList.add(new C19067A1(c22134y0.f69970Y, c22134y0.f69971Z));
        }
        return arrayList;
    }
}
