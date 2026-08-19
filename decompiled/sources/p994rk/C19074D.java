package p994rk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: rk.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C19074D implements InterfaceC19201o2, InterfaceC19205p2 {
    public static final Parcelable.Creator<C19074D> CREATOR = new C19071C();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.Footer f60751Y;

    /* JADX INFO: renamed from: Z */
    public final List f60752Z;

    public C19074D(UiComponentConfig.Footer config, List children) {
        AbstractC16544l.m18094g(config, "config");
        AbstractC16544l.m18094g(children, "children");
        this.f60751Y = config;
        this.f60752Z = children;
    }

    @Override // p994rk.InterfaceC19205p2
    /* JADX INFO: renamed from: W */
    public final InterfaceC19205p2 mo14576W(List newChildren) {
        AbstractC16544l.m18094g(newChildren, "newChildren");
        UiComponentConfig.Footer config = this.f60751Y;
        AbstractC16544l.m18094g(config, "config");
        return new C19074D(config, newChildren);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19074D)) {
            return false;
        }
        C19074D c19074d = (C19074D) obj;
        return AbstractC16544l.m18089b(this.f60751Y, c19074d.f60751Y) && AbstractC16544l.m18089b(this.f60752Z, c19074d.f60752Z);
    }

    @Override // p994rk.InterfaceC19205p2
    public final List getChildren() {
        return this.f60752Z;
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f60751Y;
    }

    @Override // p994rk.InterfaceC19201o2
    public final String getName() {
        return getConfig().getName();
    }

    public final int hashCode() {
        return this.f60752Z.hashCode() + (this.f60751Y.hashCode() * 31);
    }

    public final String toString() {
        return "FooterComponent(config=" + this.f60751Y + ", children=" + this.f60752Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f60751Y, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f60752Z, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
    }
}
