package p994rk;

import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.shared.p687ui.ButtonWithLoadingIndicator;
import kotlin.jvm.internal.AbstractC16544l;
import p310M9.C5311e;

/* JADX INFO: renamed from: rk.u2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19225u2 {
    /* JADX INFO: renamed from: a */
    public static final ButtonWithLoadingIndicator m20328a(C19221t2 c19221t2, C5311e c5311e) {
        AbstractC16544l.m18094g(c19221t2, "<this>");
        UiComponentConfig.VerifyPersonaButton.Attributes attributes = c19221t2.f60970Y.getAttributes();
        if ((attributes != null ? attributes.getUrl() : null) != null) {
            return AbstractC19213r2.m20319b(c19221t2, c5311e);
        }
        return null;
    }
}
