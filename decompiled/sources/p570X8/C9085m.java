package p570X8;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: renamed from: X8.m */
/* JADX INFO: loaded from: classes.dex */
public final class C9085m {

    /* JADX INFO: renamed from: a */
    public final long f27851a;

    public C9085m(long j10) {
        this.f27851a = j10;
    }

    /* JADX INFO: renamed from: a */
    public static C9085m m9626a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        C9085m c9085m = new C9085m(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return c9085m;
                    }
                    C9085m c9085m2 = new C9085m(jsonReader.nextLong());
                    jsonReader.close();
                    return c9085m2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th2) {
            jsonReader.close();
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9085m) {
            return this.f27851a == ((C9085m) obj).f27851a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f27851a;
        return ((int) ((j10 >>> 32) ^ j10)) ^ 1000003;
    }

    public final String toString() {
        return AbstractC10763a.m11050h(this.f27851a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
