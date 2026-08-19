package p571X9;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC16544l;
import mo.EnumC17357x;
import p544W9.AbstractC8584X3;

/* JADX INFO: renamed from: X9.i0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9300i0 {
    /* JADX INFO: renamed from: a */
    public static EnumC17357x m9878a(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return EnumC17357x.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return EnumC17357x.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return EnumC17357x.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return EnumC17357x.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return EnumC17357x.SPDY_3;
        }
        if (str.equals("quic")) {
            return EnumC17357x.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    /* JADX INFO: renamed from: b */
    public static final File m9879b(Context context, String name) {
        AbstractC16544l.m18094g(context, "<this>");
        AbstractC16544l.m18094g(name, "name");
        return AbstractC8584X3.m9250b(context, AbstractC16544l.m18100m(".preferences_pb", name));
    }
}
