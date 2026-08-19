package p994rk;

import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import java.util.List;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: renamed from: rk.p0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19203p0 implements InterfaceC19099L0 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19207q0 f60930Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f60931Z;

    public C19203p0(C19207q0 c19207q0, List list) {
        this.f60930Y = c19207q0;
        this.f60931Z = list;
    }

    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: a */
    public final UiComponentConfig.InputSelectComponentStyle mo1128a() {
        UiComponentConfig.InputInternationalDbComponentStyle styles = this.f60930Y.f60934Y.getStyles();
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
        List<C19199o0> list = this.f60931Z;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (C19199o0 c19199o0 : list) {
            arrayList.add(new C19067A1(c19199o0.f60924b, c19199o0.f60923a));
        }
        return arrayList;
    }
}
