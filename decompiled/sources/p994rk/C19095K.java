package p994rk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: rk.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C19095K implements InterfaceC19201o2, InterfaceC19205p2, InterfaceC19089I {
    public static final Parcelable.Creator<C19095K> CREATOR = new C19092J();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.HorizontalStack f60781Y;

    /* JADX INFO: renamed from: Z */
    public final List f60782Z;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f60783o0;

    public C19095K(UiComponentConfig.HorizontalStack config, List children) {
        AbstractC16544l.m18094g(config, "config");
        AbstractC16544l.m18094g(children, "children");
        this.f60781Y = config;
        this.f60782Z = children;
        this.f60783o0 = new ArrayList();
    }

    @Override // p994rk.InterfaceC19205p2
    /* JADX INFO: renamed from: W */
    public final InterfaceC19205p2 mo14576W(List newChildren) {
        AbstractC16544l.m18094g(newChildren, "newChildren");
        UiComponentConfig.HorizontalStack config = this.f60781Y;
        AbstractC16544l.m18094g(config, "config");
        return new C19095K(config, newChildren);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19095K)) {
            return false;
        }
        C19095K c19095k = (C19095K) obj;
        return AbstractC16544l.m18089b(this.f60781Y, c19095k.f60781Y) && AbstractC16544l.m18089b(this.f60782Z, c19095k.f60782Z);
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f */
    public final ArrayList getF40951o0() {
        return this.f60783o0;
    }

    @Override // p994rk.InterfaceC19205p2
    public final List getChildren() {
        return this.f60782Z;
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f60781Y;
    }

    @Override // p994rk.InterfaceC19089I
    public final JsonLogicBoolean getHidden() {
        UiComponentConfig.HorizontalStack.Attributes attributes = this.f60781Y.getAttributes();
        if (attributes != null) {
            return attributes.getHidden();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19201o2
    public final String getName() {
        return getConfig().getName();
    }

    public final int hashCode() {
        return this.f60782Z.hashCode() + (this.f60781Y.hashCode() * 31);
    }

    public final String toString() {
        return "HorizontalStackComponent(config=" + this.f60781Y + ", children=" + this.f60782Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f60781Y, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f60782Z, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
    }
}
