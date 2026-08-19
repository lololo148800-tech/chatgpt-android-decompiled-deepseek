package com.revenuecat.purchases.common.diagnostics;

import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.utils.Event;
import com.revenuecat.purchases.utils.Iso8601Utils;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import org.json.JSONException;
import org.json.JSONObject;
import p1071w0.AbstractC20734X;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\u000bHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0006H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, m18067d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;", "Lcom/revenuecat/purchases/utils/Event;", DiagnosticsEntry.NAME_KEY, "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntryName;", DiagnosticsEntry.PROPERTIES_KEY, "", "", "", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "dateTime", "Ljava/util/Date;", "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntryName;Ljava/util/Map;Lcom/revenuecat/purchases/common/DateProvider;Ljava/util/Date;)V", "getDateProvider", "()Lcom/revenuecat/purchases/common/DateProvider;", "getDateTime", "()Ljava/util/Date;", "getName", "()Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntryName;", "getProperties", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toJSONObject", "Lorg/json/JSONObject;", "toString", "Companion", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class DiagnosticsEntry implements Event {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String NAME_KEY = "name";

    @Deprecated
    public static final String PROPERTIES_KEY = "properties";

    @Deprecated
    public static final String TIMESTAMP_KEY = "timestamp";

    @Deprecated
    public static final int VERSION = 1;

    @Deprecated
    public static final String VERSION_KEY = "version";
    private final DateProvider dateProvider;
    private final Date dateTime;
    private final DiagnosticsEntryName name;
    private final Map<String, Object> properties;

    @Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m18067d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry$Companion;", "", "()V", "NAME_KEY", "", "PROPERTIES_KEY", "TIMESTAMP_KEY", "VERSION", "", "VERSION_KEY", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DiagnosticsEntry(DiagnosticsEntryName name, Map<String, ? extends Object> properties, DateProvider dateProvider, Date dateTime) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(properties, "properties");
        AbstractC16544l.m18094g(dateProvider, "dateProvider");
        AbstractC16544l.m18094g(dateTime, "dateTime");
        this.name = name;
        this.properties = properties;
        this.dateProvider = dateProvider;
        this.dateTime = dateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiagnosticsEntry copy$default(DiagnosticsEntry diagnosticsEntry, DiagnosticsEntryName diagnosticsEntryName, Map map, DateProvider dateProvider, Date date, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            diagnosticsEntryName = diagnosticsEntry.name;
        }
        if ((i10 & 2) != 0) {
            map = diagnosticsEntry.properties;
        }
        if ((i10 & 4) != 0) {
            dateProvider = diagnosticsEntry.dateProvider;
        }
        if ((i10 & 8) != 0) {
            date = diagnosticsEntry.dateTime;
        }
        return diagnosticsEntry.copy(diagnosticsEntryName, map, dateProvider, date);
    }

    private final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        String lowerCase = this.name.name().toLowerCase(Locale.ROOT);
        AbstractC16544l.m18093f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        jSONObject.put(NAME_KEY, lowerCase);
        jSONObject.put(PROPERTIES_KEY, new JSONObject(this.properties));
        jSONObject.put(TIMESTAMP_KEY, Iso8601Utils.format(this.dateTime));
        return jSONObject;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DiagnosticsEntryName getName() {
        return this.name;
    }

    public final Map<String, Object> component2() {
        return this.properties;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getDateTime() {
        return this.dateTime;
    }

    public final DiagnosticsEntry copy(DiagnosticsEntryName name, Map<String, ? extends Object> properties, DateProvider dateProvider, Date dateTime) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(properties, "properties");
        AbstractC16544l.m18094g(dateProvider, "dateProvider");
        AbstractC16544l.m18094g(dateTime, "dateTime");
        return new DiagnosticsEntry(name, properties, dateProvider, dateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiagnosticsEntry)) {
            return false;
        }
        DiagnosticsEntry diagnosticsEntry = (DiagnosticsEntry) other;
        return this.name == diagnosticsEntry.name && AbstractC16544l.m18089b(this.properties, diagnosticsEntry.properties) && AbstractC16544l.m18089b(this.dateProvider, diagnosticsEntry.dateProvider) && AbstractC16544l.m18089b(this.dateTime, diagnosticsEntry.dateTime);
    }

    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final Date getDateTime() {
        return this.dateTime;
    }

    public final DiagnosticsEntryName getName() {
        return this.name;
    }

    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return this.dateTime.hashCode() + ((this.dateProvider.hashCode() + AbstractC20734X.m21250u(this.name.hashCode() * 31, 31, this.properties)) * 31);
    }

    @Override // com.revenuecat.purchases.utils.Event
    public String toString() {
        String string = toJSONObject().toString();
        AbstractC16544l.m18093f(string, "toJSONObject().toString()");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DiagnosticsEntry(DiagnosticsEntryName diagnosticsEntryName, Map map, DateProvider dateProvider, Date date, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        dateProvider = (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider;
        this(diagnosticsEntryName, map, dateProvider, (i10 & 8) != 0 ? dateProvider.getNow() : date);
    }
}
