package androidx.credentials.playservices.controllers.CreatePassword;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16541i;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1439n;
import p157G2.AbstractC2976b;

/* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public /* synthetic */ class C10885x4c19f34c extends AbstractC16541i implements InterfaceC1439n {
    public C10885x4c19f34c(Object obj) {
        super(2, 0, CredentialProviderBaseController.Companion.class, obj, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;");
    }

    @Override // p049Bm.InterfaceC1439n
    public final AbstractC2976b invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).m11427x5e74af(str, str2);
    }
}
