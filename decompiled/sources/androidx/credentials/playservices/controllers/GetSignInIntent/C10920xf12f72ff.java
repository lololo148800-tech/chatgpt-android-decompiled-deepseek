package androidx.credentials.playservices.controllers.GetSignInIntent;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16541i;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1439n;
import p157G2.AbstractC2979e;

/* JADX INFO: renamed from: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public /* synthetic */ class C10920xf12f72ff extends AbstractC16541i implements InterfaceC1439n {
    public C10920xf12f72ff(Object obj) {
        super(2, 0, CredentialProviderBaseController.Companion.class, obj, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;");
    }

    @Override // p049Bm.InterfaceC1439n
    public final AbstractC2979e invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).m11428xd975db95(str, str2);
    }
}
