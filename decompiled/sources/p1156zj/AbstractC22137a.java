package p1156zj;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.jvm.internal.AbstractC16544l;
import p149Fj.EnumC2883q;

/* JADX INFO: renamed from: zj.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC22137a {
    /* JADX INFO: renamed from: a */
    public static final UiComponentConfig.RemoteImage m22375a(NextStep.GovernmentId.AssetConfig.CapturePage capturePage, EnumC2883q idClass, EnumC22128V0 side) {
        AbstractC16544l.m18094g(capturePage, "<this>");
        AbstractC16544l.m18094g(idClass, "idClass");
        AbstractC16544l.m18094g(side, "side");
        if (idClass == EnumC2883q.f8670q0 && side == EnumC22128V0.Front) {
            UiComponentConfig.RemoteImage passportFrontPictograph = capturePage.getPassportFrontPictograph();
            return passportFrontPictograph == null ? capturePage.getIdFrontPictograph() : passportFrontPictograph;
        }
        if (side == EnumC22128V0.Front) {
            return capturePage.getIdFrontPictograph();
        }
        if (side == EnumC22128V0.Back) {
            return capturePage.getIdBackPictograph();
        }
        if (side == EnumC22128V0.PassportSignature) {
            return capturePage.getPassportSignaturePictograph();
        }
        if (side == EnumC22128V0.BarcodePdf417) {
            return capturePage.getBarcodePdf417Pictograph();
        }
        return null;
    }
}
