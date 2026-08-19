package com.withpersona.sdk2.inquiry.network.dto;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import dj.AbstractC13178c;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p379Pb.LVf.efyhmdM;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_AssetConfig_CapturePageJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;)V", "Lbj/v;", "options", "Lbj/v;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "nullableRemoteImageAdapter", "Lbj/r;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NextStep_GovernmentId_AssetConfig_CapturePageJsonAdapter extends AbstractC11471r {
    private volatile Constructor<NextStep.GovernmentId.AssetConfig.CapturePage> constructorRef;
    private final AbstractC11471r nullableRemoteImageAdapter;
    private final C11475v options = C11475v.m12866a(efyhmdM.udXdxgvzVRvYbL, "idBackPictograph", "barcodePdf417Pictograph", "passportFrontPictograph", "passportSignaturePictograph", "idFrontHelpModalPictograph", "idBackHelpModalPictograph", "barcodeHelpModalPictograph");

    public String toString() {
        return AbstractC12107L1.m13823n(67, "GeneratedJsonAdapter(NextStep.GovernmentId.AssetConfig.CapturePage)");
    }

    @Override // bj.AbstractC11471r
    public NextStep.GovernmentId.AssetConfig.CapturePage fromJson(AbstractC11477x reader) throws NoSuchMethodException {
        reader.mo12814e();
        int i10 = -1;
        UiComponentConfig.RemoteImage remoteImage = null;
        UiComponentConfig.RemoteImage remoteImage2 = null;
        UiComponentConfig.RemoteImage remoteImage3 = null;
        UiComponentConfig.RemoteImage remoteImage4 = null;
        UiComponentConfig.RemoteImage remoteImage5 = null;
        UiComponentConfig.RemoteImage remoteImage6 = null;
        UiComponentConfig.RemoteImage remoteImage7 = null;
        UiComponentConfig.RemoteImage remoteImage8 = null;
        while (reader.hasNext()) {
            switch (reader.mo12819v0(this.options)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    break;
                case 0:
                    remoteImage = (UiComponentConfig.RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                    i10 &= -2;
                    break;
                case 1:
                    remoteImage2 = (UiComponentConfig.RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    remoteImage3 = (UiComponentConfig.RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    remoteImage4 = (UiComponentConfig.RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    remoteImage5 = (UiComponentConfig.RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    remoteImage6 = (UiComponentConfig.RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    remoteImage7 = (UiComponentConfig.RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
                case 7:
                    remoteImage8 = (UiComponentConfig.RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                    i10 &= -129;
                    break;
            }
        }
        reader.mo12818m();
        if (i10 == -256) {
            return new NextStep.GovernmentId.AssetConfig.CapturePage(remoteImage, remoteImage2, remoteImage3, remoteImage4, remoteImage5, remoteImage6, remoteImage7, remoteImage8);
        }
        Constructor<NextStep.GovernmentId.AssetConfig.CapturePage> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NextStep.GovernmentId.AssetConfig.CapturePage.class.getDeclaredConstructor(UiComponentConfig.RemoteImage.class, UiComponentConfig.RemoteImage.class, UiComponentConfig.RemoteImage.class, UiComponentConfig.RemoteImage.class, UiComponentConfig.RemoteImage.class, UiComponentConfig.RemoteImage.class, UiComponentConfig.RemoteImage.class, UiComponentConfig.RemoteImage.class, Integer.TYPE, AbstractC13178c.f41822c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(remoteImage, remoteImage2, remoteImage3, remoteImage4, remoteImage5, remoteImage6, remoteImage7, remoteImage8, Integer.valueOf(i10), null);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, NextStep.GovernmentId.AssetConfig.CapturePage value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("idFrontPictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getIdFrontPictograph());
        writer.mo12827T("idBackPictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getIdBackPictograph());
        writer.mo12827T("barcodePdf417Pictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getBarcodePdf417Pictograph());
        writer.mo12827T("passportFrontPictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getPassportFrontPictograph());
        writer.mo12827T("passportSignaturePictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getPassportSignaturePictograph());
        writer.mo12827T("idFrontHelpModalPictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getIdFrontHelpModalPictograph());
        writer.mo12827T("idBackHelpModalPictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getIdBackHelpModalPictograph());
        writer.mo12827T("barcodeHelpModalPictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getBarcodeHelpModalPictograph());
        writer.mo12823E();
    }

    public NextStep_GovernmentId_AssetConfig_CapturePageJsonAdapter(C11447L c11447l) {
        this.nullableRemoteImageAdapter = c11447l.m12850b(UiComponentConfig.RemoteImage.class, C17691y.f56482Y, "idFrontPictograph");
    }
}
