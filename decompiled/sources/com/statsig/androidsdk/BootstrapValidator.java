package com.statsig.androidsdk;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0007H\u0002J\"\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m18067d2 = {"Lcom/statsig/androidsdk/BootstrapValidator;", "", "()V", "getUserIdentifier", "", "", "customIDs", "", "isValid", "", "initializeValues", "user", "Lcom/statsig/androidsdk/StatsigUser;", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class BootstrapValidator {
    public static final BootstrapValidator INSTANCE = new BootstrapValidator();

    private BootstrapValidator() {
    }

    private final Map<String, String> getUserIdentifier(Map<?, ?> customIDs) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (customIDs == null) {
            return linkedHashMap;
        }
        for (Map.Entry<?, ?> entry : customIDs.entrySet()) {
            Object key = entry.getKey();
            if (!AbstractC16544l.m18089b(key, "stableID") && (key instanceof String)) {
                Object value = entry.getValue();
                if (value == null ? true : value instanceof String) {
                    linkedHashMap.put(key, value);
                } else if (value instanceof Map) {
                    linkedHashMap.putAll(getUserIdentifier((Map) value));
                }
            }
        }
        return linkedHashMap;
    }

    public final boolean isValid(Map<String, ? extends Object> initializeValues, StatsigUser user) {
        AbstractC16544l.m18094g(initializeValues, "initializeValues");
        AbstractC16544l.m18094g(user, "user");
        try {
            Object obj = initializeValues.get("evaluated_keys");
            Map<?, ?> map = obj instanceof Map ? (Map) obj : null;
            if (map == null) {
                return true;
            }
            Map<String, String> userIdentifier = getUserIdentifier(user.getCustomIDs());
            if (user.getUserID() != null) {
                userIdentifier.put("userID", user.getUserID());
            }
            return AbstractC16544l.m18089b(userIdentifier, getUserIdentifier(map));
        } catch (Exception unused) {
            return true;
        }
    }
}
