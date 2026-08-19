package com.revenuecat.purchases.models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import p025An.C0644w;
import p102Dm.AbstractC2119a;
import p1113xn.C21317k;
import p909nm.C17662G;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"", "Lmm/l;", "", "Lcom/revenuecat/purchases/models/Period$Unit;", "toPeriod", "(Ljava/lang/String;)Lmm/l;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PeriodKt {

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Period.Unit.values().length];
            try {
                iArr[Period.Unit.YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Period.Unit.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Period.Unit.WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Period.Unit.DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Period.Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C17309l toPeriod(String input) {
        Period.Unit unit;
        double d10;
        double d11;
        double d12;
        Pattern patternCompile = Pattern.compile("^P(?!$)(\\d+(?:\\.\\d+)?Y)?(\\d+(?:\\.\\d+)?M)?(\\d+(?:\\.\\d+)?W)?(\\d+(?:\\.\\d+)?D)?$");
        AbstractC16544l.m18093f(patternCompile, "compile(...)");
        AbstractC16544l.m18094g(input, "input");
        Matcher matcher = patternCompile.matcher(input);
        AbstractC16544l.m18093f(matcher, "matcher(...)");
        C21317k c21317k = !matcher.matches() ? null : new C21317k(matcher, input);
        if (c21317k == null) {
            return new C17309l(0, Period.Unit.UNKNOWN);
        }
        PeriodKt$toPeriod$1$toInt$1 periodKt$toPeriod$1$toInt$1 = PeriodKt$toPeriod$1$toInt$1.INSTANCE;
        String str = (String) ((C17662G) c21317k.m21657a()).get(1);
        String str2 = (String) ((C17662G) c21317k.m21657a()).get(2);
        String str3 = (String) ((C17662G) c21317k.m21657a()).get(3);
        String str4 = (String) ((C17662G) c21317k.m21657a()).get(4);
        int iIntValue = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str)).intValue();
        int iIntValue2 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str2)).intValue();
        int iIntValue3 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str3)).intValue();
        int iIntValue4 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str4)).intValue();
        if (iIntValue4 > 0) {
            unit = Period.Unit.DAY;
        } else if (iIntValue3 > 0) {
            unit = Period.Unit.WEEK;
        } else if (iIntValue2 > 0) {
            unit = Period.Unit.MONTH;
        } else {
            unit = iIntValue > 0 ? Period.Unit.YEAR : Period.Unit.UNKNOWN;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[unit.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                d11 = ((double) iIntValue) * 12.0d;
                d12 = iIntValue2;
            } else if (i10 == 3) {
                d10 = ((double) iIntValue3) + (((double) iIntValue2) * 4.345238095238096d) + (((double) iIntValue) * 52.142857142857146d);
            } else if (i10 == 4) {
                d11 = (((double) iIntValue3) * 7.0d) + (((double) iIntValue2) * 30.0d) + (((double) iIntValue) * 365.0d);
                d12 = iIntValue4;
            } else {
                if (i10 != 5) {
                    throw new C0644w();
                }
                d10 = 0.0d;
            }
            d10 = d11 + d12;
        } else {
            d10 = iIntValue;
        }
        return new C17309l(Integer.valueOf(AbstractC2119a.m3194h(d10)), unit);
    }
}
