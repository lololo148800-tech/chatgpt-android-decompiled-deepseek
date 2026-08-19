package androidx.credentials.playservices.controllers.BeginSignIn;

import android.content.Context;
import android.content.pm.PackageManager;
import ga.C13833a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mo.C17342i;
import p1060v9.AbstractC20502t;
import p132F2.AbstractC2645i;
import p132F2.C2650n;
import p903n9.C17527a;
import p903n9.C17528b;
import p903n9.C17529c;
import p903n9.C17530d;
import p903n9.C17531e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m18067d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/BeginSignInControllerUtility;", "", "()V", "Companion", "credentials-play-services-auth_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class BeginSignInControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    private static final long AUTH_MIN_VERSION_PREFER_IMME_CRED = 241217000;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "BeginSignInUtility";

    @Metadata(m18066d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m18067d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/BeginSignInControllerUtility$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "determineDeviceGMSVersionCode", "(Landroid/content/Context;)J", "curAuthVersion", "", "needsBackwardsCompatibleRequest", "(J)Z", "Lga/a;", "option", "Ln9/a;", "convertToGoogleIdTokenOption", "(Lga/a;)Ln9/a;", "LF2/n;", "request", "Ln9/e;", "constructBeginSignInRequest$credentials_play_services_auth_release", "(LF2/n;Landroid/content/Context;)Ln9/e;", "constructBeginSignInRequest", "AUTH_MIN_VERSION_JSON_PARSING", "J", "AUTH_MIN_VERSION_PREFER_IMME_CRED", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final C17527a convertToGoogleIdTokenOption(C13833a option) {
            C17342i c17342iM19206b = C17527a.m19206b();
            option.getClass();
            c17342iM19206b.f55253b = false;
            c17342iM19206b.f55255d = option.f43868e;
            String str = option.f43867d;
            AbstractC20502t.m21153d(str);
            c17342iM19206b.f55254c = str;
            c17342iM19206b.f55252a = true;
            return c17342iM19206b.m19002b();
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            PackageManager packageManager = context.getPackageManager();
            AbstractC16544l.m18093f(packageManager, "context.packageManager");
            return packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean needsBackwardsCompatibleRequest(long curAuthVersion) {
            return curAuthVersion < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        /* JADX INFO: renamed from: constructBeginSignInRequest$credentials_play_services_auth_release */
        public final C17531e m11408x545fe152(C2650n request, Context context) {
            AbstractC16544l.m18094g(request, "request");
            AbstractC16544l.m18094g(context, "context");
            C17530d c17530d = new C17530d(false);
            C17342i c17342iM19206b = C17527a.m19206b();
            c17342iM19206b.f55252a = false;
            C17527a c17527aM19002b = c17342iM19206b.m19002b();
            C17529c c17529c = new C17529c(false, null, null);
            C17528b c17528b = new C17528b(null, false);
            determineDeviceGMSVersionCode(context);
            C17527a c17527aConvertToGoogleIdTokenOption = c17527aM19002b;
            for (AbstractC2645i abstractC2645i : request.f8164a) {
                if (abstractC2645i instanceof C13833a) {
                    C13833a c13833a = (C13833a) abstractC2645i;
                    c17527aConvertToGoogleIdTokenOption = convertToGoogleIdTokenOption(c13833a);
                    AbstractC20502t.m21157h(c17527aConvertToGoogleIdTokenOption);
                    c13833a.getClass();
                }
            }
            return new C17531e(c17530d, c17527aConvertToGoogleIdTokenOption, null, false, 0, c17529c, c17528b, false);
        }

        private Companion() {
        }
    }
}
