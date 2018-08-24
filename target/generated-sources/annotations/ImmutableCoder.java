

import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Coder}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoder.builder()}.
 * Use the static factory method to get the default singleton instance:
 * {@code ImmutableCoder.of()}.
 */
@SuppressWarnings({"all"})
@Generated("org.immutables.processor.ProxyProcessor")
@org.immutables.value.Generated(from = "Coder", generator = "Immutables")
public final class ImmutableCoder extends Coder {

  private ImmutableCoder() {}

  /**
   * This instance is equal to all instances of {@code ImmutableCoder} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoder
        && equalTo((ImmutableCoder) another);
  }

  @SuppressWarnings("MethodCanBeStatic")
  private boolean equalTo(ImmutableCoder another) {
    return true;
  }

  /**
   * Returns a constant hash code value.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    return 65282084;
  }

  /**
   * Prints the immutable value {@code Coder}.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Coder{}";
  }

  private static final ImmutableCoder INSTANCE = validate(new ImmutableCoder());

  /**
   * Returns the default immutable singleton value of {@code Coder}
   * @return An immutable instance of Coder
   */
  public static ImmutableCoder of() {
    return INSTANCE;
  }


  private static ImmutableCoder validate(ImmutableCoder instance) {
    return INSTANCE != null && INSTANCE.equalTo(instance) ? INSTANCE : instance;
  }

  /**
   * Creates an immutable copy of a {@link Coder} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Coder instance
   */
  public static ImmutableCoder copyOf(Coder instance) {
    if (instance instanceof ImmutableCoder) {
      return (ImmutableCoder) instance;
    }
    return ImmutableCoder.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCoder ImmutableCoder}.
   * @return A new ImmutableCoder builder
   */
  public static ImmutableCoder.Builder builder() {
    return new ImmutableCoder.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCoder ImmutableCoder}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Coder} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Coder instance) {
      Objects.requireNonNull(instance, "instance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableCoder ImmutableCoder}.
     * @return An immutable instance of Coder
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCoder build() {
      return ImmutableCoder.of();
    }
  }
}
