package com.withpersona.sdk2.inquiry.network.dto;

import android.gov.nist.core.Separators;
import android.graphics.Color;
import bj.InterfaceC11453S;
import bj.InterfaceC11467n;
import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00062\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/RgbaHexColorAdapter;", "", "()V", "fromJson", "", "rgba", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "toJson", "(Ljava/lang/Integer;)Ljava/lang/String;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class RgbaHexColorAdapter {
    public static final RgbaHexColorAdapter INSTANCE = new RgbaHexColorAdapter();

    private RgbaHexColorAdapter() {
    }

    @InterfaceC11467n
    @RgbaHexColor
    public final Integer fromJson(String rgba) {
        Long lM21737x;
        String strM21688V = AbstractC21322p.m21688V(AbstractC21322p.m21711s0(rgba).toString().toUpperCase(Locale.ROOT), Separators.POUND);
        int length = strM21688V.length();
        if (length != 6) {
            if (length != 8 || (lM21737x = AbstractC21329w.m21737x(16, strM21688V)) == null) {
                return null;
            }
            long jLongValue = lM21737x.longValue();
            return Integer.valueOf(Color.argb((int) (jLongValue & 255), (int) ((jLongValue >> 24) & 255), (int) ((jLongValue >> 16) & 255), (int) ((jLongValue >> 8) & 255)));
        }
        Integer numM21735v = AbstractC21329w.m21735v(16, strM21688V);
        if (numM21735v == null) {
            return null;
        }
        int iIntValue = numM21735v.intValue();
        return Integer.valueOf(Color.rgb((iIntValue >> 16) & 255, (iIntValue >> 8) & 255, iIntValue & 255));
    }

    @InterfaceC11453S
    public final String toJson(@RgbaHexColor Integer rgba) {
        throw new IllegalStateException("Should not be called");
    }
}
