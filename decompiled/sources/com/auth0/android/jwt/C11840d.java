package com.auth0.android.jwt;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.auth0.android.request.internal.C11849h;
import com.google.gson.reflect.TypeToken;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Map;
import p001A.AbstractC0010F;
import p214Ib.C3670m;
import p647ak.C10707i0;

/* JADX INFO: renamed from: com.auth0.android.jwt.d */
/* JADX INFO: loaded from: classes.dex */
public final class C11840d implements Parcelable {
    public static final Parcelable.Creator<C11840d> CREATOR = new C10707i0(11);

    /* JADX INFO: renamed from: Y */
    public final String f35958Y;

    /* JADX INFO: renamed from: Z */
    public final Map f35959Z;

    /* JADX INFO: renamed from: o0 */
    public final C11841e f35960o0;

    public C11840d(String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length == 2 && str.endsWith(Separators.DOT)) {
            strArrSplit = new String[]{strArrSplit[0], strArrSplit[1], ""};
        }
        if (strArrSplit.length != 3) {
            throw new C11839c(AbstractC0010F.m19c(strArrSplit.length, "The token was expected to have 3 parts, but got ", Separators.DOT));
        }
        this.f35959Z = (Map) m13153b(m13152a(strArrSplit[0]), new JWT$2().getType());
        this.f35960o0 = (C11841e) m13153b(m13152a(strArrSplit[1]), C11841e.class);
        String str2 = strArrSplit[2];
        this.f35958Y = str;
    }

    /* JADX INFO: renamed from: a */
    public static String m13152a(String str) {
        try {
            return new String(Base64.decode(str, 11), Charset.defaultCharset());
        } catch (IllegalArgumentException e10) {
            throw new C11839c("Received bytes didn't correspond to a valid Base64 encoded string.", e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m13153b(String str, Type type) {
        try {
            C3670m c3670m = new C3670m();
            c3670m.m4379b(C11841e.class, new C11849h(1));
            return c3670m.m4378a().m4370d(new StringReader(str), TypeToken.get(type));
        } catch (Exception e10) {
            throw new C11839c("The token's payload had an invalid JSON format.", e10);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f35958Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f35958Y);
    }
}
