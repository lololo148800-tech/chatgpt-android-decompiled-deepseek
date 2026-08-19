package com.openai.feature.messages.impl.listitem.content.reference.weather;

import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p072Ci.EnumC1711p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18067d2 = {"impl_release"}, m18068k = 2, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class WeatherViewModelKt {
    /* JADX INFO: renamed from: a */
    public static final EnumC1711p m14317a() {
        int iHashCode;
        String country = Locale.getDefault().getCountry();
        return (country == null || ((iHashCode = country.hashCode()) == 2129 ? !country.equals("BS") : !(iHashCode == 2136 ? country.equals("BZ") : iHashCode == 2414 ? country.equals("KY") : !(iHashCode == 2567 ? !country.equals("PW") : !(iHashCode == 2718 && country.equals("US")))))) ? EnumC1711p.Celsius : EnumC1711p.Fahrenheit;
    }
}
