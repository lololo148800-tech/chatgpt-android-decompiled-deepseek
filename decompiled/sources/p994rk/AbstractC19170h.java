package p994rk;

import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.BaseButtonAttributes;

/* JADX INFO: renamed from: rk.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19170h {
    /* JADX INFO: renamed from: a */
    public static JsonLogicBoolean m20312a(InterfaceC19174i interfaceC19174i) {
        BaseButtonAttributes attributes = interfaceC19174i.getConfig().getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static JsonLogicBoolean m20313b(InterfaceC19174i interfaceC19174i) {
        BaseButtonAttributes attributes = interfaceC19174i.getConfig().getAttributes();
        if (attributes != null) {
            return attributes.getHidden();
        }
        return null;
    }
}
