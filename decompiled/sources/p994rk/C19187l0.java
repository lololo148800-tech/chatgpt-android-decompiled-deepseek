package p994rk;

import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: renamed from: rk.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19187l0 implements InterfaceC19099L0 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19207q0 f60907Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ LinkedHashSet f60908Z;

    public C19187l0(C19207q0 c19207q0, LinkedHashSet linkedHashSet) {
        this.f60907Y = c19207q0;
        this.f60908Z = linkedHashSet;
    }

    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: a */
    public final UiComponentConfig.InputSelectComponentStyle mo1128a() {
        UiComponentConfig.InputInternationalDbComponentStyle styles = this.f60907Y.f60934Y.getStyles();
        if (styles != null) {
            return styles.getInputSelectStyle();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: c */
    public final List mo1129c() {
        return C17689w.f56480Y;
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
        LinkedHashSet<C19191m0> linkedHashSet = this.f60908Z;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(linkedHashSet, 10));
        for (C19191m0 c19191m0 : linkedHashSet) {
            arrayList.add(new C19067A1(c19191m0.f60915a, c19191m0.f60916b));
        }
        return arrayList;
    }
}
