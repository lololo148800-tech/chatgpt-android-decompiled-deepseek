package ga;

import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC16544l;
import p132F2.C2649m;

/* JADX INFO: renamed from: ga.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13834b extends C2649m {

    /* JADX INFO: renamed from: d */
    public final String f43869d;

    /* JADX INFO: renamed from: e */
    public final String f43870e;

    public C13834b(String id2, String idToken, String str, String str2, String str3, Uri uri, String str4) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(idToken, "idToken");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", id2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", idToken);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str4);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle);
        this.f43869d = id2;
        this.f43870e = idToken;
        if (id2.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (idToken.length() <= 0) {
            throw new IllegalArgumentException("idToken should not be empty");
        }
    }
}
