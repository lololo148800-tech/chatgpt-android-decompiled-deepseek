package p994rk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import io.sentry.C15358g1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: rk.N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19105N0 implements InterfaceC19201o2, InterfaceC19240z1, InterfaceC19099L0, InterfaceC19235y, InterfaceC19089I {
    public static final Parcelable.Creator<C19105N0> CREATOR = new C19102M0();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.InputSelect f60794Y;

    /* JADX INFO: renamed from: Z */
    public final UiComponentConfig.InputSelectComponentStyle f60795Z;

    /* JADX INFO: renamed from: o0 */
    public final List f60796o0;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f60797p0;

    /* JADX INFO: renamed from: q0 */
    public final String f60798q0;

    /* JADX INFO: renamed from: r0 */
    public final String f60799r0;

    /* JADX INFO: renamed from: s0 */
    public final Object f60800s0;

    /* JADX INFO: renamed from: t0 */
    public C15358g1 f60801t0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [nm.w] */
    public C19105N0(UiComponentConfig.InputSelect config, UiComponentConfig.InputSelectComponentStyle inputSelectComponentStyle, List list) {
        Object arrayList;
        List<UiComponentConfig.Option> options;
        AbstractC16544l.m18094g(config, "config");
        this.f60794Y = config;
        this.f60795Z = inputSelectComponentStyle;
        this.f60796o0 = list;
        this.f60797p0 = new ArrayList();
        UiComponentConfig.InputSelect.Attributes attributes = config.getAttributes();
        this.f60798q0 = attributes != null ? attributes.getLabel() : null;
        this.f60799r0 = config.getName();
        UiComponentConfig.InputSelect.Attributes attributes2 = config.getAttributes();
        if (attributes2 != null) {
            attributes2.getPlaceholder();
        }
        UiComponentConfig.InputSelect.Attributes attributes3 = config.getAttributes();
        if (attributes3 == null || (options = attributes3.getOptions()) == null) {
            arrayList = C17689w.f56480Y;
        } else {
            List<UiComponentConfig.Option> list2 = options;
            arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
            for (UiComponentConfig.Option option : list2) {
                arrayList.add(new C19067A1(option.getText(), option.getValue()));
            }
        }
        this.f60800s0 = arrayList;
        this.f60801t0 = new C15358g1(this.f60796o0);
    }

    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: a */
    public final UiComponentConfig.InputSelectComponentStyle mo1128a() {
        return this.f60795Z;
    }

    @Override // p994rk.InterfaceC19240z1
    /* JADX INFO: renamed from: b */
    public final C15358g1 mo20299b() {
        return this.f60801t0;
    }

    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: c */
    public final List mo1129c() {
        return this.f60796o0;
    }

    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: d */
    public final String mo1130d() {
        return this.f60798q0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19105N0)) {
            return false;
        }
        C19105N0 c19105n0 = (C19105N0) obj;
        return AbstractC16544l.m18089b(this.f60794Y, c19105n0.f60794Y) && AbstractC16544l.m18089b(this.f60795Z, c19105n0.f60795Z) && AbstractC16544l.m18089b(this.f60796o0, c19105n0.f60796o0);
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f */
    public final ArrayList getF40900p0() {
        return this.f60797p0;
    }

    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: g */
    public final boolean mo1131g() {
        return false;
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f60794Y;
    }

    @Override // p994rk.InterfaceC19235y
    public final JsonLogicBoolean getDisabled() {
        UiComponentConfig.InputSelect.Attributes attributes = this.f60794Y.getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19089I
    public final JsonLogicBoolean getHidden() {
        UiComponentConfig.InputSelect.Attributes attributes = this.f60794Y.getAttributes();
        if (attributes != null) {
            return attributes.getHidden();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19201o2
    public final String getName() {
        return this.f60799r0;
    }

    @Override // p994rk.InterfaceC19240z1
    /* JADX INFO: renamed from: h */
    public final InterfaceC19201o2 mo20300h(List selectedOptions) {
        AbstractC16544l.m18094g(selectedOptions, "selectedOptions");
        List listM19373w0 = AbstractC17680n.m19373w0(selectedOptions, 1);
        UiComponentConfig.InputSelect config = this.f60794Y;
        AbstractC16544l.m18094g(config, "config");
        C19105N0 c19105n0 = new C19105N0(config, this.f60795Z, listM19373w0);
        C15358g1 c15358g1 = this.f60801t0;
        AbstractC16544l.m18094g(c15358g1, "<set-?>");
        c19105n0.f60801t0 = c15358g1;
        return c19105n0;
    }

    public final int hashCode() {
        int iHashCode = this.f60794Y.hashCode() * 31;
        UiComponentConfig.InputSelectComponentStyle inputSelectComponentStyle = this.f60795Z;
        return this.f60796o0.hashCode() + ((iHashCode + (inputSelectComponentStyle == null ? 0 : inputSelectComponentStyle.hashCode())) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: j */
    public final List mo1132j() {
        return this.f60800s0;
    }

    public final String toString() {
        return "InputSelectComponent(config=" + this.f60794Y + ", styles=" + this.f60795Z + ", selectedOptions=" + this.f60796o0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f60794Y, i10);
        out.writeParcelable(this.f60795Z, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f60796o0, out);
        while (itM19536s.hasNext()) {
            ((C19067A1) itM19536s.next()).writeToParcel(out, i10);
        }
    }
}
