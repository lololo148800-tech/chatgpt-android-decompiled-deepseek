package com.withpersona.sdk2.inquiry.steps.p688ui.components;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11468o;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p994rk.C19238z;
import p994rk.InterfaceC19089I;
import p994rk.InterfaceC19154d;
import p994rk.InterfaceC19201o2;
import p994rk.InterfaceC19235y;
import sk.C19662a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004R(\u0010\u000e\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;", "Lrk/o2;", "Lrk/d;", "Lrk/y;", "Lrk/I;", "Lsk/a;", "p0", "Lsk/a;", "getBitmapController", "()Lsk/a;", "setBitmapController", "(Lsk/a;)V", "getBitmapController$annotations", "()V", "bitmapController", "ui-step-renderer_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class ESignatureComponent implements InterfaceC19201o2, InterfaceC19154d, InterfaceC19235y, InterfaceC19089I {
    public static final Parcelable.Creator<ESignatureComponent> CREATOR = new C19238z();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.ESignature f40906Y;

    /* JADX INFO: renamed from: Z */
    public final Bitmap f40907Z;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f40908o0;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public C19662a bitmapController;

    public ESignatureComponent(UiComponentConfig.ESignature config, Bitmap bitmap) {
        AbstractC16544l.m18094g(config, "config");
        this.f40906Y = config;
        this.f40907Z = bitmap;
        this.f40908o0 = new ArrayList();
        this.bitmapController = new C19662a(0);
    }

    @InterfaceC11468o(ignore = true)
    public static /* synthetic */ void getBitmapController$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ESignatureComponent)) {
            return false;
        }
        ESignatureComponent eSignatureComponent = (ESignatureComponent) obj;
        return AbstractC16544l.m18089b(this.f40906Y, eSignatureComponent.f40906Y) && AbstractC16544l.m18089b(this.f40907Z, eSignatureComponent.f40907Z);
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ArrayList getF40908o0() {
        return this.f40908o0;
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f40906Y;
    }

    @Override // p994rk.InterfaceC19235y
    public final JsonLogicBoolean getDisabled() {
        UiComponentConfig.ESignature.Attributes attributes = this.f40906Y.getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19089I
    public final JsonLogicBoolean getHidden() {
        UiComponentConfig.ESignature.Attributes attributes = this.f40906Y.getAttributes();
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
        int iHashCode = this.f40906Y.hashCode() * 31;
        Bitmap bitmap = this.f40907Z;
        return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public final String toString() {
        return "ESignatureComponent(config=" + this.f40906Y + ", value=" + this.f40907Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f40906Y, i10);
        out.writeParcelable(this.f40907Z, i10);
    }
}
