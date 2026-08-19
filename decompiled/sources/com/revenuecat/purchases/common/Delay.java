package com.revenuecat.purchases.common;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p523V9.AbstractC8128k6;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NONE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001c\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, m18067d2 = {"Lcom/revenuecat/purchases/common/Delay;", "", "Lyn/b;", "minDelay", "maxDelay", "<init>", "(Ljava/lang/String;IJJ)V", "J", "getMinDelay-UwyO8pc", "()J", "getMaxDelay-UwyO8pc", "NONE", "DEFAULT", "LONG", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Delay {
    private static final /* synthetic */ Delay[] $VALUES;
    public static final Delay DEFAULT;
    public static final Delay LONG;
    public static final Delay NONE;
    private final long maxDelay;
    private final long minDelay;

    private static final /* synthetic */ Delay[] $values() {
        return new Delay[]{NONE, DEFAULT, LONG};
    }

    static {
        C21554a c21554a = C21555b.f68260Z;
        EnumC21557d enumC21557d = EnumC21557d.MILLISECONDS;
        NONE = new Delay("NONE", 0, AbstractC8128k6.m8644j(0, enumC21557d), AbstractC8128k6.m8644j(0, enumC21557d));
        long jM8644j = AbstractC8128k6.m8644j(0, enumC21557d);
        DispatcherConstants dispatcherConstants = DispatcherConstants.INSTANCE;
        DEFAULT = new Delay("DEFAULT", 1, jM8644j, dispatcherConstants.m22498getJitterDelayUwyO8pc());
        LONG = new Delay("LONG", 2, dispatcherConstants.m22498getJitterDelayUwyO8pc(), dispatcherConstants.m22499getJitterLongDelayUwyO8pc());
        $VALUES = $values();
    }

    private Delay(String str, int i10, long j10, long j11) {
        super(str, i10);
        this.minDelay = j10;
        this.maxDelay = j11;
    }

    public static Delay valueOf(String str) {
        return (Delay) Enum.valueOf(Delay.class, str);
    }

    public static Delay[] values() {
        return (Delay[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getMaxDelay-UwyO8pc, reason: not valid java name and from getter */
    public final long getMaxDelay() {
        return this.maxDelay;
    }

    /* JADX INFO: renamed from: getMinDelay-UwyO8pc, reason: not valid java name and from getter */
    public final long getMinDelay() {
        return this.minDelay;
    }
}
