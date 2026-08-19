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
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: rk.z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19239z0 implements InterfaceC19201o2, InterfaceC19240z1, InterfaceC19099L0, InterfaceC19235y, InterfaceC19089I {
    public static final Parcelable.Creator<C19239z0> CREATOR = new C19236y0();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.InputMultiSelect f60990Y;

    /* JADX INFO: renamed from: Z */
    public final UiComponentConfig.InputSelectComponentStyle f60991Z;

    /* JADX INFO: renamed from: o0 */
    public final List f60992o0;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f60993p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f60994q0;

    /* JADX INFO: renamed from: r0 */
    public final String f60995r0;

    /* JADX INFO: renamed from: s0 */
    public final String f60996s0;

    /* JADX INFO: renamed from: t0 */
    public final Object f60997t0;

    /* JADX INFO: renamed from: u0 */
    public C15358g1 f60998u0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8, types: [nm.w] */
    public C19239z0(UiComponentConfig.InputMultiSelect config, UiComponentConfig.InputSelectComponentStyle inputSelectComponentStyle, List selectedOptions) {
        Object arrayList;
        List<UiComponentConfig.Option> options;
        AbstractC16544l.m18094g(config, "config");
        AbstractC16544l.m18094g(selectedOptions, "selectedOptions");
        this.f60990Y = config;
        this.f60991Z = inputSelectComponentStyle;
        this.f60992o0 = selectedOptions;
        this.f60993p0 = new ArrayList();
        this.f60994q0 = true;
        UiComponentConfig.InputMultiSelect.Attributes attributes = config.getAttributes();
        this.f60995r0 = attributes != null ? attributes.getLabel() : null;
        this.f60996s0 = config.getName();
        UiComponentConfig.InputMultiSelect.Attributes attributes2 = config.getAttributes();
        if (attributes2 != null) {
            attributes2.getPlaceholder();
        }
        UiComponentConfig.InputMultiSelect.Attributes attributes3 = config.getAttributes();
        if (attributes3 == null || (options = attributes3.getOptions()) == null) {
            arrayList = C17689w.f56480Y;
        } else {
            List<UiComponentConfig.Option> list = options;
            arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            for (UiComponentConfig.Option option : list) {
                arrayList.add(new C19067A1(option.getText(), option.getValue()));
            }
        }
        this.f60997t0 = arrayList;
        this.f60998u0 = new C15358g1(this.f60992o0);
    }

    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: a */
    public final UiComponentConfig.InputSelectComponentStyle mo1128a() {
        return this.f60991Z;
    }

    @Override // p994rk.InterfaceC19240z1
    /* JADX INFO: renamed from: b */
    public final C15358g1 mo20299b() {
        return this.f60998u0;
    }

    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: c */
    public final List mo1129c() {
        return this.f60992o0;
    }

    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: d */
    public final String mo1130d() {
        return this.f60995r0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19239z0)) {
            return false;
        }
        C19239z0 c19239z0 = (C19239z0) obj;
        return AbstractC16544l.m18089b(this.f60990Y, c19239z0.f60990Y) && AbstractC16544l.m18089b(this.f60991Z, c19239z0.f60991Z) && AbstractC16544l.m18089b(this.f60992o0, c19239z0.f60992o0);
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f */
    public final ArrayList getF40900p0() {
        return this.f60993p0;
    }

    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: g */
    public final boolean mo1131g() {
        return this.f60994q0;
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f60990Y;
    }

    @Override // p994rk.InterfaceC19235y
    public final JsonLogicBoolean getDisabled() {
        UiComponentConfig.InputMultiSelect.Attributes attributes = this.f60990Y.getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19089I
    public final JsonLogicBoolean getHidden() {
        UiComponentConfig.InputMultiSelect.Attributes attributes = this.f60990Y.getAttributes();
        if (attributes != null) {
            return attributes.getHidden();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19201o2
    public final String getName() {
        return this.f60996s0;
    }

    @Override // p994rk.InterfaceC19240z1
    /* JADX INFO: renamed from: h */
    public final InterfaceC19201o2 mo20300h(List selectedOptions) {
        AbstractC16544l.m18094g(selectedOptions, "selectedOptions");
        UiComponentConfig.InputMultiSelect config = this.f60990Y;
        AbstractC16544l.m18094g(config, "config");
        C19239z0 c19239z0 = new C19239z0(config, this.f60991Z, selectedOptions);
        C15358g1 c15358g1 = this.f60998u0;
        AbstractC16544l.m18094g(c15358g1, "<set-?>");
        c19239z0.f60998u0 = c15358g1;
        return c19239z0;
    }

    public final int hashCode() {
        int iHashCode = this.f60990Y.hashCode() * 31;
        UiComponentConfig.InputSelectComponentStyle inputSelectComponentStyle = this.f60991Z;
        return this.f60992o0.hashCode() + ((iHashCode + (inputSelectComponentStyle == null ? 0 : inputSelectComponentStyle.hashCode())) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p994rk.InterfaceC19099L0
    /* JADX INFO: renamed from: j */
    public final List mo1132j() {
        return this.f60997t0;
    }

    public final String toString() {
        return "InputMultiSelectComponent(config=" + this.f60990Y + ", styles=" + this.f60991Z + ", selectedOptions=" + this.f60992o0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f60990Y, i10);
        out.writeParcelable(this.f60991Z, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f60992o0, out);
        while (itM19536s.hasNext()) {
            ((C19067A1) itM19536s.next()).writeToParcel(out, i10);
        }
    }
}
